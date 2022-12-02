<jsp:directive.page contentType="text/html; charset=UTF-8" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Facebook</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
    <h1>
        UsuÃ¡rios
    </h1>
    <div class="countainer">
        <div class="row">
            <div class="col- md-2"></div>
            <div class="col- md-8">
                <table class="table">
                    <thead>
                      <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">GÃªnero</th>
                        <th scope="col">Email</th>
                      </tr>
                    </thead>
                    <tbody>
                    
                    <c:forEach>var="user" items="${usuarios}"
                      <tr>
                        <th scope="row">${user.getId()}</th>
                        <td>${user.getName()}</td>
                        <td>${user.getGender()}</td>
                        <td>${user.getEmail()}</td>
                      </tr>
                      </c:forEach>

                    </tbody>
                  </table>
            </div>
            <div class="col- md-2"></div>

        </div>
        
    </div>

    <script type="text/javascrip" src="js/bootstrap.bundle.min.js"></script>    
</body>
</html>