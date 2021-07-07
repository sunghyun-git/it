	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<link rel="stylesheet" href="/resources/a/modify.css">
</head>
<body> 
        <header>
            <div class="text-area">
                <h1>나의 정보 수정</h1> 
            </div>
        </header>
        <section class="modify-form">
        <!--비밀번호-->
        <div class="int-pass"> 
        *비밀번호<br>
            <input id="pw" type="password" name="pw" placeholder="비밀번호" label for="pw"> </label> 
        </div>
        <div class="int-pass">  
            *  비밀번호 재확인<br> 
            <input type="password" name="user_PW2" placeholder="비밀번호 재확인">
            </div>
        <!--닉네임 수정-->
        <div class="int-username">
        * 닉네임<br>  <input type="text" name="user_name" value=""></div> <br>
             <!--생년월일 select를 사용해서 구현-->
             * 생년월일<br><br>
             <select name="year">
               <option value="">-- 선택 --</option>
               <option value="1994">1994</option>
               <option value="1995">1995</option>
               <option value="1996">1996</option>
               <option value="1997">1997</option>
               <option value="1998">1998</option>
               <option value="1999">1999</option>
               <option value="2000">2000</option>
             </select>
             <select name="month">
               <option value="">-- 선택 --</option>
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5</option>
               <option value="6">6</option>
               <option value="7">7</option>
               <option value="8">8</option>
               <option value="9">9</option>
               <option value="10">10</option>
               <option value="11">11</option>
               <option value="12">12</option>
             </select>
             <select name="day">
               <option value="">-- 선택 --</option>
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5</option>
               <option value="6">6</option>
               <option value="7">7</option>
               <option value="8">8</option>
               <option value="9">9</option>
               <option value="10">10</option>
               <option value="11">11</option>
               <option value="12">12</option>
               <option value="13">13</option>
               <option value="14">14</option>
               <option value="15">15</option>
               <option value="16">16</option>
               <option value="17">17</option>
               <option value="18">18</option>
               <option value="19">19</option>
               <option value="20">20</option>
               <option value="21">21</option>
               <option value="22">22</option>
               <option value="23">23</option>
               <option value="24">24</option>
               <option value="25">25</option>
               <option value="26">26</option>
               <option value="27">27</option>
               <option value="28">28</option>
               <option value="29">29</option>
               <option value="30">30</option>
               <option value="31">31</option>
             </select>
             <br><br>
           <!--이메일-->
             * 이메일<div class="fieldlabel"><label for="email01"></label>
            <div class="formfield"><input type="text" id="email01" name="email01" size="20" maxlength="20" 
                   value="" autocomplete="off"><span>@</span>
            <input id="email02" name="email02" list="domains" >
            <datalist id="domains">
               <option value="naver.com">
               <option value="daum.net">
               <option value="gmail.com">
               <option value="yahoo.co.kr">
           </datalist>
               </div><br>
        </section>
       <!--로그인 회원가입 버튼-->
            <input type="submit" value="정보수정">
            <input type="submit" value="취소"> 
        </body>
    </html>
                