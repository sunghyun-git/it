package org.zerock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.RestaurantVO;
import org.zerock.domain.Restaurant_menuVO;
import org.zerock.domain.Restaurant_offVO;
import org.zerock.domain.Restaurant_openHourVO;
import org.zerock.domain.Restaurant_reviewVO;
import org.zerock.mapper.RestaurantMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Setter(onMethod_ = { @Autowired })
	RestaurantMapper mapper;

	@Override
	public void registerRestaurant(RestaurantVO vo) {
		// log.info("vo : "+vo);
		mapper.insertRestaurant(vo);
	}

	@Override
	public void registerRestaurantOpen(List<Restaurant_openHourVO> openvo) {
		for (int i = 0; i < openvo.size(); i++) {

			mapper.insertRestaurant_open(openvo.get(i));
		}

	}

	@Override
	public void registerRestaurantOff(List<Restaurant_offVO> offvo) {
		for (int i = 0; i < offvo.size(); i++) {
			mapper.insertRestaurant_off(offvo.get(i));
		}
	}

	@Override
	public void registerRestaurantMenu(List<Restaurant_menuVO> menuvo) {
		for (int i = 0; i < menuvo.size(); i++) {
			mapper.insertRestaurant_menu(menuvo.get(i));
		}

	}

	@Override
	public RestaurantVO getRestaurant(Integer cid) {

		return mapper.readRestaurant(cid);
	}

	@Override
	public List<Restaurant_openHourVO> getRestaurantOpen(Integer cid) {
		List<Restaurant_openHourVO> vo = mapper.readRestaurant_open(cid);
		return vo;
	}

	@Override
	public List<Restaurant_offVO> getRestaurantOff(Integer cid) {
		List<Restaurant_offVO> vo = mapper.readRestaurant_off(cid);

		return vo;
	}

	@Override
	public List<Restaurant_menuVO> getRestaurantMenu(Integer cid) {
		List<Restaurant_menuVO> vo = mapper.readRestaurant_menu(cid);

		return vo;
	}

	@Override
	public List<Restaurant_reviewVO> getRestaurantReview(Integer cid) {
		List<Restaurant_reviewVO> vo = mapper.readRestaurant_review(cid);
		return vo;
	}

	@Override
	public boolean modifyRestaurant(RestaurantVO vo) {
		mapper.updateRestaurant(vo);
		return true;
	}

	@Override
	public boolean modifyRestaurantOpen(List<Restaurant_openHourVO> openvo) {
		for (int i = 0; i < openvo.size(); i++) {
			mapper.updateRestaurant_open(openvo.get(i));
		}
		return true;
	}

	@Override
	public boolean modifyRestaurantOff(List<Restaurant_offVO> offvo) {
		for(int i = 0 ; i < offvo.size() ; i++) {
			mapper.updateRestaurant_off(offvo.get(i));
		}	
		return true;
	}

	@Override
	public boolean modifyRestaurantMenu(List<Restaurant_menuVO> menuvo) {
		for (int i = 0; i < menuvo.size(); i++) {
			mapper.updateRestaurant_menu(menuvo.get(i));
		}
		return true;
	}

	@Override
	public boolean removeRestaurant(Integer cid) {
		mapper.deleteRestaurant(cid);
		return true;
	}

}