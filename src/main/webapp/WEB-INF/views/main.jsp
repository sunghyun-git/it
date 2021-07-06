<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>eat!shulang</title>
    <!-- swiper 관련 내용 -->
    <!-- 링크 : https://m.blog.naver.com/anedthh/222014406404 -->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>main view</title>
  
	<link href="/resources/a/main_view.css" rel="stylesheet">
    <link href="/resources/a/swiper.css" rel="stylesheet">
  	

  	
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">  
    <script src="https://kit.fontawesome.com/43a55c298a.js" crossorigin="anonymous"></script>
    <script src="/resources/js/jquery-3.6.0.min.js"></script>
          <script src="/resources/swiper-5.4.5/package/js/swiper.min.js"></script>
    
</head>
<!-- 메인화면 -->
<body>
    <!-- -->
    <nav class="mainbar">
        <ul>
            <p></p>
        </ul>
        <div class="mainbar_title">
            <i class="fas fa-utensils"></i>
            <a href="#">맛!슐랭</a>
        </div>
     <ul class="mainbar_join">
         <li><a href="#">로그인</a></li>
         <li><a href="#">회원가입</a></li>
     </ul>
    </nav>
        <!-- 검색 창 -->
        <div class="search">
            <input class="search-txt" type="text" placeholder="맛집 검색하기">
            <a class="search-btn" href="#">
            <i class="fas fa-search"></i>
            </a> 
        </div>
        <!-- 카테고리(하단에 swiper 기능 추가함)-->
        <section class="swiper-container">
            <div class="swiper-wrapper">
                <div class="swiper-slide">
                    <div class="category">
                        <select>
                            <option>지역</option>
                            <option>인플루언서 맛집</option>
                            <option>TV에 나온 맛집</option>
                        </select>
                    </div>
                    <article class="img_set">
                        <div class="img">
                        	<c:if test="${Restaurant0.mainphotourl != null}">
                            <img src="${Restaurant0.mainphotourl }" width="350" height="135"></a>
                            </c:if> 
                            <c:if test="${Restaurant1.mainphotourl != null}">
                            <img src="${Restaurant1.mainphotourl }" width="350" height="135"></a>
                            </c:if>
                            <c:if test="${Restaurant2.mainphotourl != null}">
                            <img src="${Restaurant2.mainphotourl }" width="350" height="135"></a>
                            </c:if>
                        </div>
                        <div class="img2">
                        	<c:if test="${Restaurant3.mainphotourl !=null }">
                            <a href="/jsonParse"><img src="${Restaurant3.mainphotourl}" width="350" height="135"></a>
                            </c:if>
                            <img src="https://via.placeholder.com/350x135"></a>
                            <img src="https://via.placeholder.com/350x135"></a>
                        </div>
                    </article>
                   </div>
                    <article class="swiper-slide">
                       <div class="category">
                            <select>
                                <option>지역</option>
                                <option>인플루언서 맛집</option>
                                <option>TV에 나온 맛집</option>
                            </select>
                       </div>
                        <div class="img_set">
                            <div class="img">
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                            </div>
                            <div class="img2">
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                            </div>
                        </div>
                    </article>
                    <article class="swiper-slide">
                       <div class="category">
                           <select>
                               <option>지역</option>
                               <option>인플루언서 맛집</option>
                               <option>TV에 나온 맛집</option>
                           </select>
                       </div>
                        <div class="img_set">
                           <div class="img">
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                            </div>
                            <div class="img2">
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                                <img src="https://via.placeholder.com/350x135"></a>
                           </div>
                       </div>
                    </article>
               </div>
                <!-- paging 처리 -->
                <div class="swiper-pagination"></div>
                <!-- paging btn -->
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </section>
    <script type="text/javascript" src="/resources/js/main_view.js"></script>
</body> 
</html>