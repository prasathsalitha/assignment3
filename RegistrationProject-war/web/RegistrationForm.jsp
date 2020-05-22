<%-- 
    Document   : registrationForm
    Created on : Mar 13, 2020, 9:25:59 AM
    Author     : Fathima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="cssRegistrationProject.css">                        
    <title>Registration Page</title>
</head>

<body>
    <header>
        <h1>Registration Page</h1>
    </header>
    
  <% String  name
          , password
          , errmsg
          ;
  
     name = request.getParameter("name");
     password  = request.getParameter("password");
     errmsg = (String) request.getAttribute("errmsg");
     
     if (name==null) name = "";
     if (password==null)  password  = ""; 
     if (errmsg==null)    errmsg    = " "; 
   %>

  <div class=registrationWrapper>
  <form action="/RegistrationProject-war/RegistrationServlet" method="get">
    <table border="0" align="left">
    	<tr>
            <td>Name </td>
            <td><input type="text" size="25" name="name" value="<%=name%>"/></td>
        </tr>
    	<tr>
            <td>Password</td>
            <td><input type="text" size="25" name="password" value="<%=password%>"/></td>
        </tr>
    	
    	<tr>
            <td>Submit </td>
            <td>
                <input type="submit" name="submit" value="submit">
            </td>
        </tr>
        <tr>
            <td>Message</td>
            <td>
                <textarea cols="30" rows="4" name="errormsg"><%=errmsg%></textarea>
            </td>
        </tr>
    </table>
  </form>
  </div>
            
</body>
</html>

