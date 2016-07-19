<%@ page language = "java" contentType = "text/html" %>
     <meta http-equiv = "Content-Type" content = "text/html">
<html>
<head>
</head>
    <body>
            <h2>Gib deinen Namen hier ein !</h2>
            <h3>Beachten sie dabei , beide Felder auszufuellen!</h3>
             <form action="HelloForm" method="GET">
                <label for= "name1">First Name: </label>
                <input type="text" id = "name1" name="first_name">

                <br>
                <label for= "name2">Last Name: <br></label>
                <input type="text" id = "name2" name = "last_name" />

                <br>
                <label for = "button">
                <input type="submit" value="Submit" />
                </label>
             </form>
        </body>
</html>
