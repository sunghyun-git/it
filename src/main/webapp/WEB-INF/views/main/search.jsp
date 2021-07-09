<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${place} 맛집  검색 결과</title>
 <script src="/resources/js/jquery-3.6.0.min.js"></script>
	<link rel="stylesheet" href="/resources/a/main_view.css" type="text/css">
    <link rel="stylesheet" href="/resources/a/swiper.css" type="text/css">
	<link rel="preconnect" href="https://fonts.googleapis.com" type="text/css">
	<link rel="preconnect" href="https://fonts.gstatic.com" type="text/css" crossorigin>
	 <link rel="stylesheet" href="/resources/a/top_list.css">
	<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet"> 
</head>
<body>
  <nav class="mainbar">   
        <div class="mainbar_title">
        <a href="/main/list"> <img src="/resources/img/eatchelin.png"></a>
        </div>
        
   <!-- 검색 창 
        <div class="search">
       	<form class='searchForm' action="/main/search" method='get'> 
            <input type="text" name='keyword'> 
            <button><i class="fas fa-search"></i></button>
            </form>	
        </div>    -->    
        
        
        
               
     <ul class="mainbar_join">
     <sec:authorize access="isAnonymous()">  <!-- 로그인 안했을 때 -->  
         <li><a href="/member/login">로그인</a></li>
         <li><a href="/member/join">회원가입</a></li>
     </sec:authorize>
     <sec:authorize access="isAuthenticated()"> <!-- 로그인 했을 때 -->
       	 <li><form method="post" name="logoutform" action="/member/logout">
       	 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
       	
       	 <a href="javascript:go();">로그아웃</a>
       	 </form></li>
       	 <li><a href="/member/mypage">마이 페이지</a></li>
     </sec:authorize>
     </ul>     
    </nav> 
    	   <div class="search">
                <form id='searchForm' action="/main/search" method='get'> 
                    <input class="search_txt" type="text" placeholder="식당 또는 지역,음식을 검색하세요." name='keyword' value="${place }"> 
                    <button class="search_btn"><i class="fas fa-search"></i></button>
                </form>   
            </div>     
              <div class="text-area">
                <h1>${place} 검색결과</h1>
            </div>
             <c:forEach var="restaurant" items="${list}">
        <ul class="list" onclick="location.href='../restaurant?cid=${restaurant.cid }'">
            <li class="itemlist">     
        <div class="box">
     
    

    <!--  이미지가 있으면 불러오고 없으면 설정된 이미지를 불러온다 -->
       <c:choose>
    	 <c:when test="${restaurant.mainphotourl != null}">
          <img src="<c:out value="${restaurant.mainphotourl}"/>"/>
    	</c:when>
    	<c:otherwise>
    		<img src="/resources/img/eatchelin.png">
    	</c:otherwise>
       </c:choose> 
      
            <div class="name">
            <h1><c:out value="${restaurant.placename}"/> <c:out value="${restaurant.rating}"/> </h1>
             <c:out value="${restaurant.catename} | "/><c:out value="${restaurant.phonenum}"/> <br>
             <c:out value="${restaurant.address}"/><br>
             <h6><c:out value="${restaurant.reviewcount}"/>/<c:out value="${restaurant.views}"/></h6>
			 </div>                        
        </div>
            </li>
        </ul>
        </c:forEach>
          
        <!-- 페이징 삭제 할듯 -->
	<div class='pull-right'>
					<ul class="pagination">
						<c:if test="${pageMaker.prev}">
							<li class="paginate_button previous"><a
								href="${pageMaker.startPage -1}">Previous</a></li>
						</c:if>
						<c:forEach var="num" begin="${pageMaker.startPage}"
							end="${pageMaker.endPage}">
							<li class="paginate_button ${pageMaker.cri.pageNum == num ? "active":""} ">
								<a href="${num}">${num}</a>
							</li>
						</c:forEach>
						<c:if test="${pageMaker.next}">
							<li class="paginate_button next"><a
								href="${pageMaker.endPage +1}">Next</a></li>
						</c:if>
					</ul>
				</div>
				<!--  end Pagination -->
				<form id='actionForm' action="/main/search" method='get'>
					<input type='hidden' name='pageNum'
						value='${pageMaker.cri.pageNum}'> 
					<input type='hidden'name='amount' value='${pageMaker.cri.amount}'>
					<input type='hidden' name='keyword' value='<c:out value="${ pageMaker.cri.keyword }"/>'>
				</form>


</body>
<script>

var searchForm = $("#searchForm");
$(document).ready(function(){
	$("#searchForm button").on("click", function(e) { 	
	if (!searchForm.find("input[name='keyword']").val()) {
	alert("키워드를 입력하세요");
	return false;
	}
	searchForm.find("input[name='pageNum']").val("1");
	e.preventDefault();
	searchForm.submit();
});


$(".paginate_button a").on("click",
function(e) {
e.preventDefault();
console.log('click');
actionForm.find("input[name='pageNum']").val($(this).attr("href"));
actionForm.submit();
});		

var actionForm = $("#actionForm");
$(".paginate_button a").on("click", function(e) {
e.preventDefault();
console.log('click');
actionForm.find("input[name='pageNum']").val($(this).attr("href"));
actionForm.submit();
});

});
</script>
     <script>

function go(){
	var f = document.logoutform;


	f.submit();
}

</script>
</body>

</html>