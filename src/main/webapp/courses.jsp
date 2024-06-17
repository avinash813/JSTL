<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>courses</title>
<style>
.list{
display:flex;
justify-content : center;
}

</style>
</head>
<body>
    <h1 style="color:red; text-align:center">The Courses you have registered are:</h1>
            <div class = "list">
            <h2 style= "margin: 0"><c:forEach var="courseName" items="${courses}" varStatus="status">
                ${status.index + 1}. ${courseName}<br>
            </c:forEach>
            </h2>
        </div>
</body>
</html>