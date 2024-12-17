<%@ page import = "java.util.*" %>
<%@ page import = "com.LoginSystem.Model.Update" %>
<%@ page import = "com.LoginSystem.Model.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<%
	String roll = request.getParameter("roll");
	Update obj = new Update();
	User us = obj.selectData(roll);
%>
    <div class="container">
        <div class="row">
            <div class="col-5 col-sm-5 col-lg-5 mx-auto mt-5">
                <form action="edit" method="post">
                    <h1>Edit User Details</h1>
                    <div class="form-group">
                        <label for="roll" class="form-label mt-2">Roll No:</label>
                        <input type="text" class="form-control" id="roll" name="roll" value="<%=us.getRoll() %>" placeholder="Enter Roll No">
                    </div>
                    <div class="form-group">
                        <label for="user" class="form-label mt-2">Name:</label>
                        <input type="text" class="form-control" id="user" name="user" value="<%=us.getUser() %>" placeholder="Enter your Name">
                    </div>
                    <div class="form-group">
                        <label for="pass" class="form-label mt-2">Password:</label>
                        <input type="text" class="form-control" id="pass" name="pass" value="<%=us.getPass() %>" placeholder="Enter your Password">
                    </div>
                    <div class="form-group">
                        <label for="city" class="form-label mt-2">City:</label>
                        <input type="text" class="form-control" id="city" name="city" value="<%=us.getCity() %>" placeholder="Enter your City">
                    </div>
                    <input type="submit" class="btn btn-primary mt-3" value="Edit">
                </form>
            </div>
        </div>
    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>