<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<link href="https://unpkg.com/tabulator-tables@4.0.5/dist/css/tabulator.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="https://unpkg.com/tabulator-tables@4.0.5/dist/js/tabulator.min.js"></script>

</head>
<body>

${list.data.XEM}
${list.data.XEM.opening_price}

<script>



</script>
<div id="example-table"></div>

<script>
var table = new Tabulator("#example-table", {
 	height:205, // set height of table (in CSS or here), this enables the Virtual DOM and improves render speed dramatically (can be any valid css height value)
 	layout:"fitColumns", //fit columns to width of table (optional)
 	columns:[ //Define Table Columns
	 	{title:"코인", field:"coin", width:150},
	 	{title:"가격", field:"opening_price", width:150},
	 	{title:"거래량", field:"units_traded", width:150}
	 	//{title:"거래량", field:"units_traded", align:"left", formatter:"progress"}
	 	//{title:"Favourite Color", field:"col"},
	 	//{title:"Date Of Birth", field:"dob", sorter:"date", align:"center"},
 	],
 	rowClick:function(e, row){ //trigger an alert message when the row is clicked
 		alert("Row " + row.getData().id + " Clicked!!!!");
 	},
});

//for(var i = 0; i < 3; i++){
	//alert("test");
//}

//define some sample data
var tabledata = [
	//{id:1, coin:"BTC", price:${list.data.XEM}},
	//{id:1, name:"Oli Bob", age:"12", col:"red", dob:""},
	//{id:2, name:"Mary May", age:"1", col:"blue", dob:"14/05/1982"},
	//{id:3, name:"Christine Lobowski", age:"42", col:"green", dob:"22/05/1982"},
	//{id:4, name:"Brendon Philips", age:"125", col:"orange", dob:"01/08/1980"},
	//{id:5, name:"Margret Marmajuke", age:"16", col:"yellow", dob:"31/01/1999"},
];

//tabledata.push({id:2, coin:"BTC", price:${list.XEM.opening_price}},);

var cnt = 1;
var json = ${list.data};
for(var key in json){
	tabledata.push({id:cnt, coin:key, opening_price:json[key].opening_price, units_traded:json[key].units_traded},);
	cnt++;
}

//load sample data into the table
table.setData(tabledata);
</script>


</body>	
</body>
</html>