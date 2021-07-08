/**
 * 
 */
 
//지도 띄우는 코드   container: 지도가 표시될 HTML 요소
var mapContainer = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스

var   mapOption = { //지도를 생성 할 때 필요한 기본 옵션
			center: new kakao.maps.LatLng( 37.54125302274094, 126.83819281864368 ), //지도의 중심 좌표 (더조은 아카데미 좌표값으로 임의로 설정)   
			level: 5,    //지도의 레벨(확대, 축소 정도)   레벨이 낮을수록 많이 확대됨
            // disableDoubleClickZoom:true   // 더블클릭으로 확대 가능여부  true로 하면 더블클릭으로 확대 불가능
	};

var map = new kakao.maps.Map(mapContainer, mapOption);  //지도 생성 및 객체 리턴    