<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel="stylesheet" href="/resources/a/login.css">
</head>
 <body> 
        <!--header-->
        <section class="login-form"><br><br><br><br>
            <h1>잇! 슐랭</h1> 
            <!--아이디-->
        <form action="../main" method="POST">
            <div class="int-area"> 
                <input id="userid" type="text" name="userid" placeholder="아이디"> 
                <label for="userid">아이디</label> 
            </div>
            <!--비밀번호-->
            <div class="int-area"> 
                    <input id="pw" type="password" name="pw" placeholder="비밀번호"> 
                    <label for="pw">비밀번호</label> 
                </div>
                <!--아이디 비밀번호 찾기 캡션-->
                <div class="caption">
                    <a href="">아이디/비밀번호 찾기</a>
                </div>
                <!--로그인 회원가입 버튼-->
                    <input type="submit" value="로그인">  
                    <input type="submit" value="회원가입"> 
                </form>
            </section> 
            </body> 
            </html>

    