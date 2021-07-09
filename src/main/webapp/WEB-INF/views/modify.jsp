<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음식점 수정 </title>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
 <link rel="stylesheet" href="/resources/a/main_view.css" type="text/css">
 <link rel="stylesheet" href="/resources/a/register2.css" type="text/css">
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
	  return "<input type='text' name='menu' id='test "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='메뉴' style='background:transparent; border:none; border-bottom: solid 1px #ccc; padding: -10px 5px 10px; font-size:14pt; width: 200px; height: 1%; margin-top: 10px; margin-bottom: 10px;'>"
	  +"&nbsp;<input type='text' name='price' id='test "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='가격'style='background:transparent; border:none; border-bottom: solid 1px #ccc; padding: -10px 5px 10px; font-size:14pt; width: 200px; height: 1%; margin-top: 10px; margin-bottom: 10px;'> <br>";
	}
 
function deleteInput() {
  if (arrInput.length > 0) { 
     arrInput.pop(); 
     arrInputValue.pop();
  }
  display(); 
}
</script>

<script type="text/javascript">
// 오픈시간, 브레이크타임, 라스트오더 추가 
var arrInput1 = new Array(0);
var arrInputValue1 = new Array(0);

function addInput1() {
arrInput1.push(arrInput.length);
arrInputValue1.push("");
display1();
}

function display1() {
document.getElementById('parah1').innerHTML="";
for (intI=0;intI<arrInput1.length;intI++) {
  document.getElementById('parah1').innerHTML+=createInput1(arrInput1[intI], arrInputValue1[intI]);
}
}

function saveValue1(intId,strValue) {
arrInputValue1[intId]=strValue;
}  

function createInput1(id,value) {
	return "<input type='text' name='periodName' id='test1 "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='영업 기간 이름(ex ○월~○일)' style='background:transparent; border:none; border-bottom: solid 1px #ccc; padding: -10px 5px 10px; font-size:14pt; width: 325px; height: 1%; margin-top: 10px; margin-bottom: 10px;'><br>" 
	+"<input type='text' name='timeName' id='test1 "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='영업시간,브레이크타임,라스토오더타임' style='background:transparent; border:none; border-bottom: solid 1px #ccc; padding: -10px 5px 10px; font-size:14pt; width: 325px; height: 1%; margin-top: 10px; margin-bottom: 10px;'><br>"
	+"<input type='text' name='timeSE' id='test1 "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='영업시간 (ex 11:00 ~ 22:00)' style='background:transparent; border:none; border-bottom: solid 1px #ccc; padding: -10px 5px 10px; font-size:14pt; width: 325px; height: 1%; margin-top: 10px; margin-bottom: 10px;'><br>"
	+"<input type='text' name='dayOfWeek' id='test1 "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='영업일자(ex 매일,월~금)' style='background:transparent; border:none; border-bottom: solid 1px #ccc; padding: -10px 5px 10px; font-size:14pt; width: 325px; height: 1%; margin-top: 10px; margin-bottom: 10px;'><br>"

	;
	}

function deleteInput1() {
if (arrInput1.length > 0) { 
   arrInput1.pop(); 
   arrInputValue1.pop();
}
display1(); 
}


</script>

</head>
<body>
<%@ include file="includes/header2.jsp"%>
<form method="post" action="/modify">
<input type="hidden" name="cid" value="${cid }">
<h1>음식점 정보</h1>
<section class="modify-form">
<div class="int-pass">
<input type="text" name="placename" value="${Restaurant.placename }" placeholder="음식점 이름"><br>
<input type="text" name="address" value="${Restaurant.address}" placeholder="음식점  주소"><br>
<input type="text" name="catename" value="${Restaurant.catename }" placeholder="카테고리(ex : 한식, 양식, 고기 등)"><br>
<input type="text" name="parking" value="${Restaurant.parking}" placeholder="주차 여부 (Y or N)"><br>
<input type="text" name="phonenum" value="${Restaurant.phonenum}" placeholder="음식점  번호"><br>
</div>
</section>
<hr>
<h1>음식점 오픈 시간, 브레이크, 라스트오더 타임</h1>
<section class="modify-form">
<div class="int-pass">
<c:if test="${open != null}">
<c:forEach var="open" items="${open }">
<input type="text" name="periodName" value="${open.periodName }" placeholder="영업 기간 이름(ex ○월~○일)"><br>
<input type="text" name="timeName" value="${open.timeName }" placeholder="영업시간,브레이크타임,라스토오더타임"><br>
<input type="text" name="timeSE" value="${open.timeSE }" placeholder="영업시간 (ex 11:00 ~ 22:00)"><br>
<input type="text" name="dayOfWeek" value="${open.dayOfWeek }" placeholder="영업일자(ex 매일,월~금)"><br>
</c:forEach>
</c:if>
<div id="parah1"></div>
<br><br>
<input type="button" value="추가" onclick="addInput1();" />
<input type="button" value="삭제" onclick="deleteInput1();"/><br>
</div>
</section>
<hr>
<h1>음식점 휴무일</h1>
<section class="modify-form">
<div class="int-pass">
<c:if test="${off != null }">
<c:forEach var="off" items="${off}">
<input type="text" name="holydayName" value="${off.holydayName }" placeholder="휴무일 이름 ex(휴무일,공휴일,설당일 등)"><br>

<input type="text" name="offdate" value="${off.offdate }" placeholder="휴무 요일"><br>
</c:forEach>
</c:if>
</div>
</section>
<hr>

<h1>메뉴 </h1>
<section class="modify-form">
<div class="int-pass">
<c:if test="${menu !=null}">
<c:forEach var="menu" items="${menu }">
				<input type="text" name="menu" value="${menu.menu }">&nbsp;<input type="text" name="price" value="${menu.price }"><br>
</c:forEach>
</c:if>
<div id="parah"></div>
<br><br>
<input type="button" value="추가" onclick="addInput();" />
<input type="button" value="삭제" onclick="deleteInput();"/><br>
<hr>
</div>
</section>
<br>
<button type="submit">음식점 정보 수정하기</button>
<input type="button" value="음식점 삭제하기" onclick="location.href = '/delete?cid=${cid}'"/>
</form>


</body>
</html>