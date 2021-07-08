package org.zerock.service;

import java.util.List;

import org.zerock.domain.RestaurantVO;
import org.zerock.domain.Restaurant_menuVO;
import org.zerock.domain.Restaurant_offVO;
import org.zerock.domain.Restaurant_openHourVO;
import org.zerock.domain.Restaurant_reviewVO;

public interface RestaurantService {
	public void registerRestaurant(RestaurantVO vo);
	public void registerRestaurantOff(List<Restaurant_offVO> offvo);
	public void registerRestaurantOpen(List<Restaurant_openHourVO> openvo);
	public void registerRestaurantMenu(List<Restaurant_menuVO> menuvo);
	
	
	public RestaurantVO getRestaurant(Integer cid);
	public List<Restaurant_openHourVO> getRestaurantOpen(Integer cid);
	public List<Restaurant_offVO> getRestaurantOff(Integer cid);
	public List<Restaurant_menuVO> getRestaurantMenu(Integer cid);
	public List<Restaurant_reviewVO> getRestaurantReview(Integer cid);
	
	public boolean modifyRestaurant(RestaurantVO vo);
	public boolean modifyRestaurantOpen(List<Restaurant_openHourVO> openvo);
	public boolean modifyRestaurantOff(List<Restaurant_offVO> offvo);
	public boolean modifyRestaurantMenu(List<Restaurant_menuVO> menuvo);
	
	
	public boolean removeRestaurant(Integer cid);
	
	public List<RestaurantVO>getList();
	public List<RestaurantVO>topList(String address);	//xml파일에 id가 topList로 설정되어있는 쿼리문을 가져옴
	public List<RestaurantVO>topListcat(String address);
	public List<RestaurantVO>orderByrating();
	public List<RestaurantVO>orderByview();
	public List<RestaurantVO>orderByreview();
	
	
	public List<RestaurantVO>searchFood(String keyword); //검색페이지에서 사용 할 예정
	
}
