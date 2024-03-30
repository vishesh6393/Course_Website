
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<div>
<h1>Welcome to registration page created by vishesh</h1>
<form:form  action="registerUser" modelAttribute="user" >
Name:
<form:input path="name"/>
<br><br>
Gender: <br>
Male
<form:radiobutton path="gender" value="male"/>
<br/> Female<form:radiobutton path="gender" value="female"/>

<br><br>
Location:
<form:select path="location" >
<form:option value="India">  </form:option>
<form:option value="NRI">  </form:option>
</form:select>
<br><br>

College:
<form:select path="college" >
<form:option value="SRMU">  </form:option>
<form:option value="SRMCEM">  </form:option>
</form:select>

<br><br>
<input type="Submit">
</form:form>
</div>
</html>
