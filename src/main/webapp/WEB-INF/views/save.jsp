<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
  crossorigin="anonymous"
/>

<html>
  <head>
    <title>Title</title>
  </head>

  <body>
    <h2>학생 등록</h2>
    <form action="/save" method="post" class="card mx-5 p-3">
      학번: <input type="text" name="studentNumber" /> <br />
      이름: <input type="text" name="studentName" /> <br />
      학과: <input type="text" name="studentMajor" /> <br />
      전화번호: <input type="text" name="studentMobile" /> <br />
      <input type="submit" value="전송" class="btn btn-primary" />
    </form>
  </body>
</html>
