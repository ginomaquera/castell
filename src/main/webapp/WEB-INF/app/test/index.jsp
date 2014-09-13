<%-- 
    Document   : index
    Created on : 06/09/2014, 11:27:20 AM
    Author     : SABADO-MANHANA
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>titulo : ${titulo}</h1>
        <h2>contenido : ${contenido}</h2>      
        
        <c:forEach var="i" items="${personas}">
            <p> <c:out value="${i.nombres}"/><p> 
            <p> <c:out value="${i.paterno}"/><p> 
            <p> <c:out value="${i.materno}"/><p> 
        </c:forEach>
                
      <form method="post" action="guardarPrograma">
            <label> Paterno </label>
            <input type="text" name="paterno" value="${persona.paterno}"/>
            
            <label> Materno </label>
            <input type="text" name="materno" value="${persona.materno}"/>
            
            <label> Nombres </label>
            <input type="text" name="nombres" value="${persona.nombres}"/>
            
            <input type="submit" value="Guardar" class="btn"/>
                
        </form>          
        
    </body>
</html>
