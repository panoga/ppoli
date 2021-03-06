package com.ppoli.abas;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Maps;
import com.ppoli.abas.bithumb.PublicApi;
import com.ppoli.abas.dto.List;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	PublicApi papi;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/allselect", method = RequestMethod.GET)
	public ModelAndView coinselect(Locale locale, Model model) {
	
		ModelAndView mav = new ModelAndView();
		mav.setViewName("coinList");
		
		String coinlist = papi.ticker("ALL", "KRW");
		
		JSONParser jparser = new JSONParser();
		
		Map<String, Object> map = Maps.newHashMap();
//		List list 
		
		
		try {
			
			JSONArray ja = new JSONArray();
			
			JSONObject jobject = (JSONObject) jparser.parse(coinlist);
			
			List list = new List();
			list.setData(jobject.get("data"));
			System.out.println("jobject.get(\"data\") : " + jobject.get("data"));
			map.put("data", jobject.get("data"));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ParseException");
		} 
		
//		mav.addObject("data", jobject.get("data"));
		mav.addObject("list", map);
		
		return mav;
		
	}
}
