<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${Restaurant.placename }</title>
</head>
<body>

<form method="get" action="/modify">
	<!-- 가게 정보  -->
	<input type="hidden" value="${Restaurant.cid }" name="cid">
	<img src="${Restaurant.mainphotourl}">
	<br> ${Restaurant.placename } (${Restaurant.catename })
	(${Restaurant.views }) ${Restaurant.rating }
	<br> ${Restaurant.address}



	<c:if test="${Restaurant.parking eq 'Y' }">
		<h4>주차 가능</h4>

	</c:if>

	<c:if test="${Restaurant.phonenum != null }">
${Restaurant.phonenum}

</c:if>
	
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
	<button type="submit">수정하기</button>
	</form>
</body>
</html>