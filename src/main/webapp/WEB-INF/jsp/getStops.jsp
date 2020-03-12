<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-social/5.1.1/bootstrap-social.css"/>
    <link rel="stylesheet" href="/css/style.css"/>
<title>Get Stops</title>
</head>
<body>

<div class="container">
        <div class="row">
            <div class="col-md-6">
                <h2>Search Tickets</h2>
                <p><tr><td><label id="sourceLabel">Enter Source</label><br></td>
                <td> <select name="Source">
 <c:forEach var="stop" items="${stops}">
  <option value="${stop.name}">${stop.name}</option>
</c:forEach>
</select><br></td> </tr><br>
                
               
                <tr><td><label id="destinationLabel">Enter Destination</label><br></td>
                <td> <select name="Source">
 <c:forEach var="stop" items="${stops}">
  <option value="${stop.name}">${stop.name}</option>
</c:forEach>
</select><br></td></tr>
                </p>
               
                <p><a  class="btn btn-secondary" id="btn" role="button" >Search</a></p>
            
            <p>
           
</p>
            </div>
        </div>
    </div>


 
<%--  <c:forTokens items = "${stops}" delims = "," var = "stop">
         <c:out value = "${stop}"/><p>
      </c:forTokens> --%>
</body>
</html>