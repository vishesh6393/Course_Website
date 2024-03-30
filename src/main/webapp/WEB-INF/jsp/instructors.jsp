<%@ page import ="java.util.*" %>
<html>
<head>
    <title>Welcome to instructors page</title>
</head>
<body>
    <h1>Welcome to instructors page</h1>

    <%
        ArrayList<HashMap<String,Object>> listOfInstructors=
        (ArrayList<HashMap<String,Object>>)request.getAttribute("instructors");

        for(HashMap<String,Object> instructor:listOfInstructors){
    %>
    Name: <%= instructor.get("name") %>
    <a href="profile/<%= instructor.get("id") %>">Profile</a>
    <br/>
    <%
        }
    %>
</body>
</html>
