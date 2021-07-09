<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${Restaurant.placename }</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

<form method="get" action="/modify">
	<!-- 가게 정보  -->
	<input type="hidden" value="${Restaurant.cid }" name="cid">
	<input type="hidden" value="${Restaurant.address} ${Restaurant.placename }" name="placeaddress" id="placeaddress">
	<img src="${Restaurant.mainphotourl}" width="700" height="580">
	<br> ${Restaurant.placename } (${Restaurant.catename })
	(${Restaurant.views }) ${Restaurant.rating }
	<br> ${Restaurant.address}



	<c:if test="${Restaurant.parking eq 'Y' }">
		<h4>주차 가능</h4>

	</c:if>

	<c:if test="${Restaurant.phonenum != null }">
${Restaurant.phonenum}

</c:if>
	<div id="map" style="width:350px;height:350px;"></div>
	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=ddfa64a774c1422fb95b40bd0dc99e12&libraries=services"></script>

<script>
var placeaddress = document.getElementById('placeaddress').value;
console.log(placeaddress);
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = {
        center: new kakao.maps.LatLng(37.5642135, 127.0016985), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };  

// 지도를 생성합니다    
var map = new kakao.maps.Map(mapContainer, mapOption); 

// 주소-좌표 변환 객체를 생성합니다
var geocoder = new kakao.maps.services.Geocoder();

// 주소로 좌표를 검색합니다
geocoder.addressSearch(placeaddress, function(result, status) {

    // 정상적으로 검색이 완료됐으면 
     if (status === kakao.maps.services.Status.OK) {

        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

        // 결과값으로 받은 위치를 마커로 표시합니다
        var marker = new kakao.maps.Marker({
            map: map,
            position: coords
        });

        // 인포윈도우로 장소에 대한 설명을 표시합니다
        var infowindow = new kakao.maps.InfoWindow({
            content: '<div style="width:150px;text-align:center;padding:6px 0;">${Restaurant.placename}</div>'
        });
        infowindow.open(map, marker);

        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
        map.setCenter(coords);
    } 
});    
</script>
	<!-- 가게 오픈 타임과 브레이크타임, 라스트오더 -->
	<c:if test="${open != null}">
		<c:forEach var="open" items="${open }">
			<table>
				<tr>
					<td>${open.periodName }
				</tr>
				<c:if test="${open.timeName != null}">
					<tr>
						<td>${open.timeName }</td>
					</tr>
				</c:if>
				<tr>
					<c:if test="${open.timeSE != null}">

						<td>${open.timeSE }&nbsp;</td>

					</c:if>
					<c:if test="${open.dayOfWeek != null}">

						<td>${open.dayOfWeek }</td>

					</c:if>
				</tr>
			</table>
		</c:forEach>
	</c:if>

	<!-- 가게 휴무일 -->


	<c:if test="${off != null }">
		<c:forEach var="off" items="${off}">
			<table>
				<tr>
					<c:if test="${off.holydayName != null }">
						<td>${off.holydayName }</td>
					</c:if>
					<c:if test="${off.offdate != null }">
						<td>${off.offdate }</td>
					</c:if>
				</tr>
			</table>
		</c:forEach>
	</c:if>

	<br>
	<br>
	<br>
	<h3>메뉴</h3>
	<c:if test="${menu != null }">
		<table>
			<c:forEach var="menu" items="${menu }">
				<tr>
					<td>${menu.menu }:${menu.price }
				<tr>
			</c:forEach>

		</table>
	</c:if>
	<br>
	<hr>
	<br>
	<!-- 리뷰 -->
	<c:if test="${review !=null }">
		<c:forEach var="review" items="${review }">
			<table>
				<tr>
					<td>${review.rw_writer }<br> <c:choose>
							<c:when test="${review.rw_rating eq 5 }">
								<td>★★★★★
							</c:when>
							<c:when test="${review.rw_rating eq 4 }">
								<td>★★★★☆
							</c:when>
							<c:when test="${review.rw_rating eq 3 }">
								<td>★★★☆☆
							</c:when>
							<c:when test="${review.rw_rating eq 2 }">
								<td>★★☆☆☆
							</c:when>
							<c:when test="${review.rw_rating eq 1 }">
								<td>★☆☆☆☆
							</c:when>
							<c:when test="${review.rw_rating eq 0 }">
								<td>☆☆☆☆☆
							</c:when>

						</c:choose>
				</tr>
				<tr>
					<td>${review.rw_content }<br> <c:if
							test="${review.rw_photo !=null }">
							<td><img src="${review.rw_photo }" width="200"><br>
						</c:if>
				</tr>
				<tr>
					<td>${review.rw_updatedate }
				</tr>
			</table>
			<br>
			<br>
		</c:forEach>
	</c:if>
	 <sec:authorize access="hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')"> 
	 
	<button type="submit">수정하기</button>
	</sec:authorize>
	</form>
	
</body>
</html>