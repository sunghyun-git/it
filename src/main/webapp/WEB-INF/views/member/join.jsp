<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/resources/a/join.css">
</head>
 <body>
        <!--header-->
        <section class="join-form">
            <br><h1>회원가입</h1>
            <h5>잇! 슐랭에 방문해주셔서 감사합니다</h5><br>
            <form name="login" action="portfolio" method="POST">
            <!--아이디 div class int-area로 잡아서 만듦-->
            <div class="int-area">
            * 아이디<br>
            <input type="text" name="user_ID"  >
            </div>
            <!--아이디 체크 버튼 -->
            <input type="button" name="user_IDcheck" value="아이디 중복 확인"> 
            <br>
            <!--비밀번호-->
            <div class="int-area">
             *  비밀번호<br> 
            <input type="password" name="user_PW1">
            </div> 
            <!--비밀번호 재확인-->
            <div class="int-area">  
             *  비밀번호 재확인<br> 
            <input type="password" name="user_PW2">
            </div>
            <!--비밀번호 재확인 체크 버튼-->
            <input type="button" name="user_PWcheck" value="비밀번호 재확인">
            <br>
            <!--닉네임-->
            <div class="int-area">
            * 닉네임<br>  <input type="text" name="user_name" value=""></div> 
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
              <div>
            <!--성별-->
              * 성별<br>
              <input type="radio" name="gender" value="m" id="man"label for="man">남자</input>
              <input type="radio" name="gender" value="m" id="woman"label for="woman">여자</input></div><br>
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
                </div>
            <!--휴대전화-->
             <div class="int-area">
             * 휴대전화<br>  
            <input type="text" name="user_phone" ></div>
            <!--이용약관동의-->
            <fieldset>
                <legend>약관</legend>
                <input type="checkbox" name="checkbox" value="1">이용약관 동의(필수)</input><br>
                <input type="checkbox" name="checkbox" value="2">개인정보 수집, 이용 동의(필수)</input><br>
                <input type="checkbox" name="checkbox" value="3">개인정보 이용 동의(필수)</input><br>
                <input type="checkbox" name="checkbox" value="4">이벤트, 혜택정보 수신동의(선택)</input><br>
                <input type="checkbox" name="checkbox" value="5" onclick='selectAll(this)'>모두 동의
            </fieldset>
            <!--회원 가입 버튼-->
            <input type="submit" value="회원가입"> 
            </form>
            </section>
            <script type="text/javascript">
            function selectAll(selectAll)  {
            	  const checkboxes 
            	       = document.getElementsByName('checkbox');
            	  
            	  checkboxes.forEach((checkbox) => {
            	    checkbox.checked = selectAll.checked;
            	  })
            	}
            </script>
          </body>
        </html>