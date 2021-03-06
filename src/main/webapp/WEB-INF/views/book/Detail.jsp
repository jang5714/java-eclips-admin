<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 상세</h2>

<form action="<%= application.getContextPath() %>/books/detail" method="post">
  <div class="container">
    <label for="bookId"><b>bookId</b></label>
    	<input type="text" placeholder="bookId" name="bookId" required>
    <label for="bookName"><b>bookName</b></label>
    	<input type="text" placeholder="bookName" name="bookName" required>
    <label for="price"><b>price</b></label>
    	<input type="text" placeholder="price" name="price" required>
    <label for="pubId"><b>pubId</b></label>
    	<input type="text" placeholder="pubId" name="pubId" required>
    <button type="submit">책 상세</button>
  </div>
</form>

</body>
</html>