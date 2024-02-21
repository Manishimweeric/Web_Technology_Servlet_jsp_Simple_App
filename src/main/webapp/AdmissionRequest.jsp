<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
 <style>
  table{
   width: 400px;
   margin-left: 100px;
  font-family: "Arial Narrow";
  }
  td{
   padding-left: 20px;
   padding-top: 15px;
  }

 </style>
</head>
<body>
<center>
 <br>
  <h2 style="font-family: 'Arial Narrow'">Student Information</h2>
  <table>
 <tr><td colspan="2" style="color: blue"></span> Person Information</td> </tr>
 <tr><td>Student ID </td><td>:</td><td><%=  request.getAttribute("studentid") %></td></tr>
 <tr><td>Full Name</td><td>:</td><td><%= request.getAttribute("fullnames") %> </td></tr>
 <tr><td>Email</td><td>:</td><td> <%= request.getAttribute("email")%></td></tr>
 <tr><td>Phone Number</td><td>:</td><td> <%=  request.getAttribute("phone") %> </td></tr>
      <tr><td>Date Of Birth</td><td>:</td><td> <%= request.getAttribute("dob") %>  </td></tr>
      <tr><td colspan="2" style="color: blue">Address Information</td> </tr>
 <tr><td>State</td><td>:</td><td> <%=  request.getAttribute("state") %> </td></tr>
 <tr><td>Country</td><td>:</td><td><%=  request.getAttribute("country") %> </td></tr>
 <tr><td>City</td><td>:</td><td> <%= request.getAttribute("city") %> </td></tr>

      <tr><td colspan="2" style="color: blue">School Information</td> </tr>
   <tr><td>Faculty</td><td>:</td><td><%= request.getAttribute("faculty") %> </td></tr>
 <tr><td>Department</td><td>:</td><td><%= request.getAttribute("department") %></td></tr>
</table>
    <br>
  <h2 style="font-family: 'Arial Narrow'">Admission Feedback</h2>
 <p style="font-family: 'Arial Narrow'">
  Thank you for submitting your admission request.<br> We have received your information and will review it shortly.<br>
    You will be notified via email once your admission request has been processed.</p>


</center>
<div style=" margin-left: 80%; margin-top: -60px">
<a href="applyform.jsp" class="btn btn-primary" >Print</a>
</div>


</body>
</html>