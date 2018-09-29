<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/security/tags"  prefix="security"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="home">StreetLife Clothing</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
     
     
      <security:authorize access="hasRole('ROLE_ADMIN')">
      <li class="nav-item">
        <a class="nav-link" href="Admin">Admin </a>
      </li>
      
  
       
      </security:authorize>
      
     <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" data-toggle="navbardrop" href="#" id="navbardrop" data-toggle="dropdown">Product
 			Product
          <li><a href="#">Product</a></li>
                </ul>
      </li>
 
     
     
      <security:authorize access="isAnonymous()">
      
      <li class="nav-item">
        <a class="nav-link" href="Login">Login</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Sign">SignUp</a>
      </li> 
      </security:authorize>
      
         	<security:authorize access="isAuthenticated()">
         
      <li class="nav-item">
        <a class="nav-link" href="#">LogOut</a>
      </li>
      </security:authorize>    
    </ul>
  </div>  
</nav>

</html>