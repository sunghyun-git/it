package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.RestaurantVO;
import org.zerock.domain.Restaurant_menuVO;
import org.zerock.domain.Restaurant_offVO;
import org.zerock.domain.Restaurant_openHourVO;
import org.zerock.domain.Restaurant_reviewVO;
import org.zerock.domain.SampleVO;

import lombok.Data;


public interface RestaurantMapper {
	
	// read
	public RestaurantVO readRestaurant(Integer cid);
	public List<Restaurant_openHourVO> readRestaurant_open(Integer cid);
	public List<Restaurant_offVO> readRestaurant_off(Integer cid);
	public List<Restaurant_menuVO> readRestaurant_menu(Integer cid);
	public List<Restaurant_reviewVO> readRestaurant_review(Integer cid);
	
	// create
	public void insertRestaurant(RestaurantVO vo);
	public void insertRestaurant_open(Restaurant_openHourVO vo);
	public void insertRestaurant_off(Restaurant_offVO vo);
	public void insertRestaurant_menu(Restaurant_menuVO vo);
	public void insertRestaurant_review(Restaurant_reviewVO vo);
	
	
	//update
	public void updateRestaurant(RestaurantVO vo);
	public void updateRestaurant_open(Restaurant_openHourVO vo);
	public void updateRestaurant_off(Restaurant_offVO vo);
	public void updateRestaurant_menu(Restaurant_menuVO vo);
	public void updateRestaurant_review(Restaurant_reviewVO vo);
	
	//delete
	
	public void deleteRestaurant(Integer cid);
	public void deleteRestaurant_open(Restaurant_openHourVO vo);
	public void deleteRestaurant_off(Restaurant_offVO vo);
	public void deleteRestaurant_menu(Restaurant_menuVO vo);
	public void deleteRestaurant_review(Restaurant_reviewVO vo);
	
}
