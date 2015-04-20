<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body bgcolor=<%=session.getAttribute("bgcolor")%>>
     <div style="background-color: <%=session.getAttribute("postcolor")%>; color: <%=session.getAttribute("fcolor")%>; width: 450px; height: 450px; vertical-align: middle">
     Hello
     </div>
     </br>
     <div style="background-color:  <%=session.getAttribute("postcolor")%>; color: <%=session.getAttribute("fcolor")%>; width: 450px; height: 450px; float: middle">
     Hello
     </div>
     </br>
     </div>
     <div style="background-color: <%=session.getAttribute("postcolor")%>; color: <%=session.getAttribute("fcolor")%>; width:450px; height: 50px; vertical-align: middle">
     <a href="preferences">Set Preferences</a>
     </div>
</body>
</html>