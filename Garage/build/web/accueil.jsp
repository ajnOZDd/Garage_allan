<%-- 
    Document   : accueil
    Created on : 14 janv. 2023, 15:00:46
    Author     : allan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/all.css">
        <link rel="stylesheet" href="./css/accueil.css">
        <title>accueil</title>
    </head>
    <body>
 <div>
     <h1><% out.println(request.getSession().getAttribute("name")); %> </h1>
     
 </div> 
    </body>
</html>
