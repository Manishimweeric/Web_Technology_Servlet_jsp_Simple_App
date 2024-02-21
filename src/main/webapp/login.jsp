<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Assignment three</title>
  <link rel="stylesheet" href="sty.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<br>
<div class="link">
    <a href="index.html" class="btn btn-primary">Home </a>
    <a href="convert.jsp" class="btn btn-primary">Convert </a>
  <a href="signup.html" class="btn btn-primary">Sign Up</a>
</div>
<div class="logo"> <img src="img/fffffff.jpg" style="width: 90px; height: 95px;border-radius: 100%"></div>
<div class="heading">HR Website</div>

<div class="body-page" style="font-family: 'Arial Narrow'";>
  <br><br><br><br>
    <%
        Object pass=session.getAttribute("passworddata");
        Object user=session.getAttribute("emaildata");
        if (pass != null && user!=null) {
    %>
  <form action="LoginServlet" method="post" >
    <H2  style="font-family: 'Cambria Math'"; >HR LOGIN FORM </H2><br>
    <input type="email"  name="username" required placeholder="Username" value="<%= user%>" ><br><br>
    <input type="password" name="password" required placeholder="Password" value="<%= pass%>">
    <br><br>
    <button type="submit" class="btn btn-primary">Login</button>&nbsp;&nbsp;
  </form>
    <%
        }
    %>
    <br>
  <h3  style="font-family: 'Arial Narrow'; font-size: 18px; color: crimson" >
   <%
  Object resultAttribute = request.getAttribute("result");
  if (resultAttribute != null) {
   %>
   <%= resultAttribute%>
   <%
   }
   %>
  </h3>


</div>

</body>
</html>