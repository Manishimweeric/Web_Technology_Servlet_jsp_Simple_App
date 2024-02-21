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
  <a href="/LogoutServlet" class="btn btn-primary">Log Out</a>
</div>
<div class="logo"> <img src="img/fffffff.jpg" style="width: 90px; height: 95px;border-radius: 100%"></div>
<div class="heading">HR Website</div>
<div class="body-page" style="font-family: 'Arial Narrow'";>
  <h3>Welcome To DashBord &nbsp;&nbsp; Actor : &nbsp;&nbsp;
  <%
  Object resultAttribute = session.getAttribute("fullnames");
  if (resultAttribute != null) {
  %>
  <%= resultAttribute%>
  <%
    }
  %>
    </h3>
  <br>
  <br>
  <form action="AdmissionRequest" method="post" enctype="multipart/form-data">

    <H3>&nbsp;&nbsp;&nbsp; STUDENT ADMISSION FORM</H3>
    <br>
    <table>
      <tr>
        <td><input type="text" name="fullname"  required placeholder="Full Name"></td>
        <td> <input type="text" name="email"  required placeholder="Email"></td>
      </tr>
      <tr>
        <td><input type="radio" name="gender" value="Male" required style="width: 50px;height: 15px"">Male
          <input type="radio" name="gender" value="Female" required style="width: 50px;height: 15px">Female
        </td>
        <td><input type="text" name="phone"  required placeholder="Phone Number"></td>
      <tr>
        <td><input type="text" name="state" placeholder="State "></td>
        <td> <input type="text" name="country"  required placeholder="Country"></td>
      </tr>
      <td><input type="text" name="city"  required placeholder="City"></td>
      <td><input type="date" name="dob"  required  style="width: 300px"></td>
      </tr>
      <tr>
        <td><input type="text" name="faculty"  required placeholder="Faculty"></td>
        <td> <input type="text" name="department"  required placeholder="Department"></td>
      </tr>
      <tr>
        <td>Passport :</td>
        <td> <input type="file" name="passportfile"  required ></td>
      </tr>
      <tr>
        <td>Certificate :</td>
        <td > <input type="file" name="certificatefile"  required ></td>
      </tr>
      <tr>
        <td colspan="2">
          <br>
          <button type="submit" class="btn btn-primary" name="admission" value="submit">Register</button>&nbsp;

        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>