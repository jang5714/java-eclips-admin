<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath()%>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 목록</h2>
<a href="${ctx}/move/home/intro">초기 화면</a>
<a href="${ctx}/move/book/Register">추가 등록</a>

<form action="<%= application.getContextPath() %>/books" method="post">

  <div class="container">
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="bookId" name="bookId" required>

    <label for="bookName"><b>bookName</b></label>
    <input type="text" placeholder="bookName" name="bookName" required>
        
    <label for="price"><b>price</b></label>
    <input type="text" placeholder="price" name="price" required>

    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>
    
    <button type="submit">register</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>