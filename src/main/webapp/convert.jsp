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
  <a href="convert.jsp"  class="btn btn-primary">Convert </a>
  <a href="signup.html" class="btn btn-primary">Sign Up </a>
</div>
<div class="logo"> <img src="img/fffffff.jpg" style="width: 90px; height: 95px;border-radius: 100%"></div>
<div class="heading">HR Website</div>

<div class="body-page" style="font-family: 'Arial Narrow'";>
  <br><br><br>
  <form action="ConvertServlet" method="post">
    <H2  style="font-family: 'Cambria Math';font-size: 28px ">CONVERTING NUMBERS</H2>
<br><br>
    <h4 style="font-family: 'Arial Narrow';font-size: 18px">Enter a decimal number (0,9)</h4>
    <input type="number" name="number1" required>
    <br><br>
    <button type="submit" name="binary" value="Binary" class="btn btn-outline-primary" >Binary</button>&nbsp;&nbsp;
    <button type="submit" name="Hexa" value="Hexa" class="btn btn-outline-primary">Hexa</button>&nbsp;&nbsp;
    <button type="submit" name="octal" value="octal" class="btn btn-outline-primary" >Octal</button>&nbsp;&nbsp;
    <button type="submit" name="clear" value="clear" class="btn btn-outline-primary">Clear</button>
  </form>
  <br><br>

<div class="res" >

  <h3  style="font-family: 'Cambria Math';font-size: 18px;">Decimal number  : &nbsp;&nbsp;&nbsp;
    <%
    Object numbersAttribute = request.getAttribute("numbers");
    if (numbersAttribute != null) {
    %>
    <%= numbersAttribute %>
    <%
    }
    %>
  </h3>
  <h3  style="font-family: 'Cambria Math';font-size: 18px;">Result  : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <%
    Object resultsAttribute = request.getAttribute("result");
    if (resultsAttribute != null) {
    %>
    <%= resultsAttribute%>
    <%
    }
    %>
  </h3>
  <h3  style="font-family: 'Candara'; font-size: 18px;">Status  : &nbsp;&nbsp;&nbsp;&nbsp;
    <%
    Object statusAttribute = request.getAttribute("status");
    if (statusAttribute != null) {
    %>
    <%= statusAttribute%>
    <%
    }
    %>
  </h3>
</div>
</div>
</body>
</html>