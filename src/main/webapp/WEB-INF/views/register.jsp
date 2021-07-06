<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음식점 추가 </title>
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
  return "<input type='text' name='menu' id='test "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='메뉴' value='"+ 
 
value +"'>" +"<input type='text' name='price' id='test "+ id +"' onChange='javascript:saveValue("+ id +",this.value)' placeholder='가격' value='"+ 
	 
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
<form method="post" action="/register">
<h1>음식점 정보</h1>
<input type="text" name="placename" placeholder="음식점 이름"><br>
<input type="text" name="address" placeholder="음식점  주소"><br>
<input type="text" name="catename" placeholder="카테고리(ex : 한식, 양식, 고기 등)"><br>
<input type="text" name="parking" placeholder="주차 여부 (Y or N)"><br>
<input type="text" name="phonenum" placeholder="음식점  번호"><br>
<hr>
<h1>음식점 오픈 시간, 브레이크, 라스트오더 타임</h1>
<input type="text" name="periodName" placeholder="영업 기간 이름(ex ○월~○일)"><br>
<input type="text" name="timeName" placeholder="영업시간,브레이크타임,라스토오더타임"><br>
<input type="text" name="timeSE" placeholder="영업시간 (ex 11:00 ~ 22:00)"><br>
<input type="text" name="dayOfWeek" placeholder="영업일자(ex 매일,월~금)"><br>
<hr>
<h1>음식점 휴무일</h1>
<input type="text" name="holydayName" placeholder="휴무일 이름 ex(휴무일,공휴일,설당일 등)"><br>
<input type="text" name="offdate" placeholder="휴무 요일"><br>

<hr>

<h1>메뉴 </h1>
<div id="parah"></div>
<input type="button" value="추가" onclick="addInput();" />
<input type="button" value="삭제" onclick="deleteInput();"/><br>
<hr>
<button type="submit">음식점 정보 추가하기</button>


</form>
</body>
</html>