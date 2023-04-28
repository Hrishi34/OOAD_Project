<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />

    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
      crossorigin="anonymous"
    />
    <link type="text/css" rel="stylesheet" href="{{ url_for('static', filename='styles.css') }}">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">

<style>
.mySlides {display:none;}
</style>
    <link rel="shortcut icon" href="{{ url_for('webapp', filename='round.png') }}">
    <title>PESU</title>
  </head>
  <body>
    
    <nav class="navbar navbar-expand-lg navbar-dark shadow-lg"  >
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbar"
      >
        <span class="navbar-toggler-icon" id="navlist" ></span>
      </button>
      <div class="collapse navbar-collapse " >
        <div class="navbar-nav"  >
          <img class="mt-2 ml-7 mb-3"  src="PESU.png">
          <div class="mt-3" style="height:1cm;padding-left:2cm;">
          <button style="width:3cm" class="btn btn-primary ml-3 mr-5" ><a  class="nav-item nav-link   text-white " id="home" href="/">Home</a></button>
          <button style="width:3cm" class="btn btn-primary ml-3 mr-5"><a class="nav-item nav-link text-white" id="logout" href="/logout">Logout</a></button>
          <button style="width:3cm" class="btn btn-primary ml-3 mr-5"><a class="nav-item nav-link text-white" id="login" href="/login">Login</a></button>

          <button style="width:3cm" class="btn btn-primary ml-3 mr-5" ><a class="nav-item nav-link text-white" id="signin" href="/signup">Sign Up</a></button>
          <button style="width:5cm" class="btn btn-primary ml-3 mr-5" ><a class="nav-item nav-link text-white" id="signin" href=www.google.com target="_blank">Electives Details</a></button>

        </div>
      </div>
      </div>
    </nav>

    <div class="shadow-lg p-3 mb-5 bg-body-tertiary rounded mt-5 ml-5 row">
        <img src="regg.jpg" class="mt-5 ml-5" style="padding-right: 0cm;height:11cm;width:7cm;padding-left:0cm;padding-top:2cm;">
      
          <div class="container mt-3 " id="form2">
            <div style="padding-left: 2cm;">
            <img class="mt-2 ml-5" style="max-block-size: 3cm;padding-left:2.7cm" src="pes.png">
            <h1 style="font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif ;padding-left:0cm">Elective Registration Form</h1>
              <a  class="nav-item nav-link" id="login" style="color:crimson" href="/stu_dash">Main Page</a>
             
               <form class="form-floating mt-3 mb-4" method='post'>
                <div class="form-floating mt-3 mb-3">
                  <label for="usr">Student Name</label>
               <input type="text" class="form-control" id="usr" style="width: 10cm;" name="stu_name" placeholder="Enter Student Name" required>
               
             </div>
             
             <div class="form-floating mt-3 mb-3">
              <label for="usr">SRN</label>
           <input type="text" class="form-control" id="usr" name="stu_srn" style="width: 10cm;" placeholder="Enter SRN" required>
           
         </div>
         <label for="dr">Semester</label>
         <select class="form-control" id="dr" name="stu_sem" style="width: 10cm;" aria-label="Default select example">
          <option value=5>5</option>
          <option value=6>6</option>
        </select>
      <div class="form-floating mt-3 mb-3">
          <label for="usr">Email</label>
       <input type="email" class="form-control" id="usr" style="width: 10cm;" name="stu_email" placeholder="Enter Email" required>
       
      </div>
      <div class="form-floating mt-3 mb-3">
          <label for="usr">Contact Number</label>
       <input type="tel" class="form-control" id="usr" style="width: 10cm;" name="stu_con" placeholder="Enter Contact Number" required>
       
      </div>
      <label for="sec">Section</label>
      <select class="form-control" id="sec" name="stu_sem" style="width: 10cm;" aria-label="Default select example">
       <option value=A>A</option>
       <option value=B>B</option>
       <option value=C>C</option>
       <option value=D>D</option>
       <option value=E>E</option>
       <option value=F>F</option>
       <option value=G>G</option>
       <option value=H>H</option>
       <option value=I>I</option>
       <option value=J>J</option>
       <option value=K>K</option>
       <option value=L>L</option>

     </select>
     <div class="form-floating mt-3 mb-3">
        <label for="gpa">CGPA</label>
     <input type="tel" class="form-control" id="gpa" style="width: 10cm;" name="stu_gpa" placeholder="Enter CGPA " required>
     
    </div>
    <div class="form-floating mt-3 mb-3">
    <label for="pre">Do you meet the required Pre-requisite Courses</label>
    <select class="form-control" id="pre" name="stu_pre" style="width: 10cm;" aria-label="Default select example">
     <option value=5>5</option>
     <option value=6>6</option>
   </select>
</div>
   <div class="form-floating mt-3 mb-3">
   <label for="e1">Elective-I</label>
   <select class="form-control" id="e1" name="e1" style="width: 10cm;" aria-label="Default select example">
    <option value=5>5</option>
    <option value=6>6</option>
  </select>
</div>
  <div class="form-floating mt-3 mb-3">
  <label for="e2">Elective-II</label>
  <select class="form-control" id="e2" name="e2" style="width: 10cm;" aria-label="Default select example">
   <option value=5>5</option>
   <option value=6>6</option>
 </select>
</div>
         <button type="submit" class="btn btn-primary mb-3 mt-3" style="width: 10cm;">Submit</button>
               </form>
              </div>
      </div>
      </div>

<style>
    #form2{border: 2px solid black;
        border-radius: 4px;
        width: 15cm;
        height: 32cm;
        
      }
  
</style>    
<script>

</script>
   
    <script
      src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
      integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
      integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
      integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
      crossorigin="anonymous"
    ></script>
    
    <script
      type="text/javascript"
      src="{{ url_for('static', filename='index.js') }}"
    ></script>
  
  <footer class="bd-footer text-muted shadow-lg mt-5" >
    <div class="container-fluid bg-dark row" style="font-style: oblique;font-family:'Courier New', Courier, monospace;color:black;" >
      <p class="column mt-2" style="padding-left: 1cm;color:aliceblue">Copyright © PES University, Bengaluru, India.</p>
      <p class="column mt-2" style="padding-left: 10cm;color:aliceblue"> Any Query write <a >harsha2002adiyar@gmail.com</a></p>
  
         </div>
  </footer>

  </body>
</html>

