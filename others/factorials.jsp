<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width" />
<title>Factorials</title>
<link href="styledev.css" rel="stylesheet" type="text/css" />
</head>

<body>
<ul>
<% for(int i=1;i<=10;i++)
{
	int x=1;
	for(int j=1;j<=i;j++)
		x=x*j;
	out.println("<li>"+i+" ! = "+x+"</li>");
}
%>
</ul>
</body>
</html>