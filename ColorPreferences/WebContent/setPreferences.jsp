<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="submit" method="get">
     Choose your prefered theme:
     </br>
      </br>Background color:
    <select name="bgcolor">
    </br>
    <option value="Black" selected="selected">Black</option>
    <option value="White">White</option>
    <option value="Red">Red</option>
    <option value="Yellow">Yellow</option>
    <option value="Green">Green</option>
    <option value="Blue">Blue</option>
    </select>
    </br>
     </br>Font color:
    <select name="fontcolor">
    </br>
    <option value="Black" selected="selected">Black</option>
    <option value="White">White</option>
    <option value="Red">Red</option>
    <option value="Yellow">Yellow</option>
    <option value="Green">Green</option>
    <option value="Blue">Blue</option>
    </select>
    </br>
     </br>Post color:
    <select name="postcolor">
    </br>
    <option value="Black" selected="selected">Black</option>
    <option value="White">White</option>
    <option value="Red">Red</option>
    <option value="Yellow">Yellow</option>
    <option value="Green">Green</option>
    <option value="Blue">Blue</option>
    </select>
     </br>
	<input type ="submit" value="Submit"/></br>
	</form>
</body>
</html>