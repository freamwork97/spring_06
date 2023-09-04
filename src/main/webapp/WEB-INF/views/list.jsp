<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <h2>학생목록</h2>
    <table class="table table-dark table-striped">
      <tr>
        <td>아이디</td>
        <td>학번</td>
        <td>이름</td>
        <td>학과</td>
        <td>전화번호</td>
      </tr>
      <c:forEach items="${studentList}" var="student">
        <tr>
          <td>
            <a href="/detail?id=${student.id}">${student.id}</a>
          </td>
          <td>${student.studentNumber}</td>
          <td>${student.studentName}</td>
          <td>${student.studentMajor}</td>
          <td>${student.studentMobile}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
