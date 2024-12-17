<%@ page import = "java.util.*" %>
<%@ page import = "com.LoginSystem.Model.Select" %>
<%@ page import = "com.LoginSystem.Model.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        .wrapper
        {
            margin-top: 100px;
        }
        .table
        {
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="h1 mt-3">Simple CRUD Login System with JSP,Servlet,JDBC and MySQL</h1>
        <div class="wrapper">
            <a href="login.jsp" class="btn btn-success">Add User</a>
            <table class="table table-bordered table-hover mt-5">
                <tr>
                    <th>Roll No</th>
                    <th>Name</th>
                    <th>Password</th>
                    <th>City</th>
                    <th>Operations</th>
                </tr>
                <%
                Select s = new Select();
                List<User> list = s.showData();
                Iterator<User> itr = list.iterator();
                while(itr.hasNext())
                {
                	User obj = new User();
                	obj = itr.next();
               %>
               
                <tr>
                    <td><%=obj.getRoll() %></td>
                    <td><%=obj.getUser() %></td>
                    <td><%=obj.getPass() %></td>
                    <td><%=obj.getCity() %></td>
                    <td><a href="edit.jsp?roll=<%=obj.getRoll() %>" class="btn btn-sm btn-primary me-2">Edit</a> <a href="Delete.jsp?roll=<%=obj.getRoll() %>" class="btn btn-sm btn-danger">Delete</a></td>
                </tr>
               
               
               <%
                }
               %>
               
             
               
            </table>
        </div>
    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>