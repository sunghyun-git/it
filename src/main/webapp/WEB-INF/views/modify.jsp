<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음식점 수정 </title>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script>
var arrInput = new Array(0);
  var arrInputValue = new Array(0);
 
function addInput() {
  arrInput.push(arrInput.length);
  arrInputValue.push("");
  display();
}
 
function display() {
  document.getElementById('parah').innerHTML="";
  for (intI=0;intI<arrInput.length;intI++) {
    document.getElementById('parah').innerHTML+=createInput(arrInput[intI], arrInputValue[intI]);
  }
}
 
function saveValue(intId,strValue) {
  arrInputValue[intId]=strValue;
}  
 
function createInput(id,value) {
  return "<input type='text' name='menu' id='test "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' value='메뉴' value='"+ 
 
value +"'>" +"<input type='text' name='price' id='test "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' value='가격' value='"+ 
	 
	value +"'><br>";
}
 
function deleteInput() {
  if (arrInput.length > 0) { 
     arrInput.pop(); 
     arrInputValue.pop();
  }
  display(); 
}
</script>

</head>
<body>
<form method="post" action="/modify">
<h1>음식점 정보</h1>
<input type="text" name="placename" value="${Restaurant.placename }"><br>
<input type="text" name="address" value="${Restaurant.address}"><br>
<input type="text" name="catename" value="${Restaurant.catename }"><br>
<input type="text" name="parking" value="${Restaurant.parking}"><br>
<input type="text" name="phonenum" value="${Restaurant.phonenum}"><br>
<hr>
<h1>음식점 오픈 시간, 브레이크, 라스트오더 타임</h1>
<input type="text" name="periodName" value="${open.periodName }"><br>
<input type="text" name="timeName" value="${open.timeName }"><br>
<input type="text" name="timeSE" value="${open.timeSE }"><br>
<input type="text" name="dayOfWeek" value="${open.dayOfWeek }"><br>
<hr>
<h1>음식점 휴무일</h1>
<input type="text" name="holydayName" value="${off.holydayName }"><br>
<input type="text" name="offdate" value="${off.offdate }"><br>

<hr>

<h1>메뉴 </h1>
<c:forEach var="menu" items="${menu }">
				<input type="text" name="menu" value="${menu.menu }"> <input type="text" name="price" value="${menu.price }"><br>
</c:forEach>
<div id="parah"></div>
<input type="button" value="추가" onclick="addInput();" />
<input type="button" value="삭제" onclick="deleteInput();"/><br>
<hr>
<button type="submit">음식점 정보 수정하기</button>


</form>
</body>
</html>