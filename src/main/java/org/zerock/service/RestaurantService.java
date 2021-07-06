package org.zerock.service;

import java.util.List;

import org.zerock.domain.RestaurantVO;
import org.zerock.domain.Restaurant_menuVO;
import org.zerock.domain.Restaurant_offVO;
import org.zerock.domain.Restaurant_openHourVO;
import org.zerock.domain.Restaurant_reviewVO;

public interface RestaurantService {
	public void registerRestaurant(RestaurantVO vo);
	public void registerRestaurantOff(Restaurant_offVO offvo);
	public void registerRestaurantOpen(Restaurant_openHourVO openvo);
	public void registerRestaurantMenu(List<Restaurant_menuVO> menuvo);
	
	
	public RestaurantVO getRestaurant(Integer cid);
	public List<Restaurant_openHourVO> getRestaurantOpen(Integer cid);
	public List<Restaurant_offVO> getRestaurantOff(Integer cid);
	public List<Restaurant_menuVO> getRestaurantMenu(Integer cid);
	public List<Restaurant_reviewVO> getRestaurantReview(Integer cid);
	
	public boolean modifyRestaurant(RestaurantVO vo);
	public boolean modifyRestaurantOpen(Restaurant_openHourVO openvo);
	public boolean modifyRestaurantOff(Restaurant_offVO offvo);
	public boolean modifyRestaurantMenu(List<Restaurant_menuVO> menuvo);
	
	
	public boolean remove(Integer cid);
}
