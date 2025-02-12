<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
        <%@page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1"/>
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous"/>
</head>

<body>
   <div class="container">
   <div class="row"> <!-- corrected "calss" to "class" -->
   <div class="col-md-6 offset-md-3">
   <div class="card">
   <div class="card-header text-center fs-3">Register form</div>
   <div class="card-body">
    <form action="createUser " method="post">

    <div class="mb-3">
        <label for="exampleInputUsername" class="form-label">Username</label>
        <input type="text" class="form-control" id="exampleInputUsername" aria-describedby="usernameHelp" name ="fullName">
        <div id="usernameHelp" class="form-text">Choose a unique username.</div>
    </div>
      <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
      </div>
      <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" name="password">
      </div>
      <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1"   name="check">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
   </div></div>
   </div>
   </div>
</body>
</html>