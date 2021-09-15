<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>User 정보수정</h2>

<form action="<%= application.getContextPath() %>/customers/update" method="post">
  <div class="container">
    <label for="custId"><b>custId</b></label>
    	<input type="text" placeholder="custId" name="custId" required>
    <label for="custName"><b>custName</b></label>
    	<input type="text" placeholder="custName" name="custName" required>
    <label for="address"><b>address</b></label>
    	<input type="text" placeholder="address" name="address" required>
    <label for="phone"><b>phone</b></label>
    	<input type="text" placeholder="phone" name="phone" required>
	    <input type="hidden" name="_method" value="PUT"/>
    <button type="submit">User정보 수정</button>
  </div>
</form>


<h2>책 삭제</h2>
<form action="<%= application.getContextPath() %>/customers/delete">
  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="custId" name="custId" required>

    <button type="submit">책 삭제!</button>
  </div>
</form>

</body>
</html>