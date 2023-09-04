<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <h2>상세정보</h2>
          <td>학생정보:${student}</td> <br>
          <td>학번:${student.studentNumber}</td> <br>
          <td>이름:${student.studentName}</td> <br>
          <td>학과:${student.studentMajor}</td> <br>
          <td>전화번호:${student.studentMobile}</td> <br>
  </body>
</html>
