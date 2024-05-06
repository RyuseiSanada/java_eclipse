<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="model.SiteEV" %>
 
 <% 
 SiteEV siteEV = (SiteEV)application.getAttribute("siteEV");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>真田のページ</title>
</head>
<body>
<a href="SanadaIndex?action=like">いいね</a>：
<%= siteEV.getLike() %>人
<a href="SanadaIndex?action=dislike">よくないね</a>：
<%= siteEV.getDislike() %>人
</body>
</html>