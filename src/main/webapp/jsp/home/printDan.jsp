<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
int dan =2;
if(request.getParameter("dan")!= null){
	dan=Integer.parseInt(request.getParameter("dan"));
}
int limit = 1; 
if(request.getParameter("limit")!=null){
limit= Integer.parseInt(request.getParameter("limit"));
}

String color =  "blue";
if(request.getParameter("color")!=null){
color = request.getParameter("color");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>==<%=dan %>단==</h1>
	<div>Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
	Voluptas exercitationem quas tempora possimus. 
	Nostrum eaque eos ducimus similique vitae fugit omnis itaque suscipit quaerat iusto? 
	Rem totam optio fugit sit?</div>
	<%
	for(int i = 1; i<=limit; i++){ 
	%>
	<div style="color:<%= color%>;"><%=dan %> 
	* 
	<%=i %> 
	= 
	<%=dan*i %>
	</div>
	<%} %>
</body>
</html>