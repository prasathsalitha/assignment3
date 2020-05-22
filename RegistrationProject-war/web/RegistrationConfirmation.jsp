<%-- 
    Document   : RegistrationConfirmation
    Created on : Mar 13, 2020, 9:32:57 AM
    Author     : Fathima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cssRegistrationProject.css">                                
        <title>Confirmation Page</title>
    </head>
    <body>
    <header>
        <h1>Confirmation Page</h1>
    </header>

    
  <% String  name
          , password
          , result
          , errmsg
          ;
  
     name = request.getParameter("name");
     password  = request.getParameter("password");
     result = (String) request.getAttribute("result");
     errmsg = (String) request.getAttribute("errmsg");
     
     if (name==null) name = "";
     if (password==null)  password  = ""; 
     if (result==null)    result    = " ";
     if (errmsg==null)    errmsg    = " "; 
   %>
   <h2>Thank you for your submission!</h2>

    <table>
    	<tr>
            <td class="leftSide">Name:</td>
            <td class="rightSide"><%=name%></td>
        </tr>
    	<tr>
            <td class="leftSide">Password:</td>
            <td class="rightSide"><%=password%></td>
        </tr>
    </table>

               

    </body>
</html>


