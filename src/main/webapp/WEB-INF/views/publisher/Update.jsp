<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 수정</h2>

<form action="<%= application.getContextPath() %>/publishers/update" method="post">
  <div class="container">
    <label for="pubId"><b>pubId</b></label>
    	<input type="text" placeholder="pubId" name="pubId" required>
    <label for="pubName"><b>pubName</b></label>
    	<input type="text" placeholder="pubName" name="pubName" required>
    <label for="mgrName"><b>mgrName</b></label>
    	<input type="text" placeholder="mgrName" name="mgrName" required>
    <label for="phone"><b>phone</b></label>
    	<input type="text" placeholder="phone" name="phone" required>
	    <input type="hidden" name="_method" value="PUT"/>
    <button type="submit">책 수정</button>
  </div>
</form>


<h2>책 삭제</h2>
<form action="<%= application.getContextPath() %>/publishers/delete">
  <div class="container">
    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="pubId" name="pubId" required>

    <button type="submit">책 삭제!</button>
  </div>
</form>

</body>
</html>