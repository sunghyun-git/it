package org.zerock.mapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.domain.RestaurantVO;
import org.zerock.domain.Restaurant_braekVO;
import org.zerock.domain.Restaurant_menuVO;
import org.zerock.domain.Restaurant_offVO;
import org.zerock.domain.Restaurant_openHourVO;
import org.zerock.domain.Restaurant_reviewVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Configuration
@Log4j
public class test1234 {

	@Setter(onMethod_ = @Autowired)
	private RestaurantMapper mapper;

	@Test
	public void testinsertall() {

		Integer[] cid = { 2029456983 };

		for (int i = 0; i < cid.length; i++) {
			JSONObject jsonObject = conAddr(cid[i].toString());
			//testInsertRestaurant(cid[i].toString(), jsonObject);
			// testInsertRestaurant_open(cid[i].toString(), jsonObject);
			// testInsertRestaurant_off(cid[i].toString(), jsonObject);
			// testInsertRestaurant_menu(cid[i].toString(), jsonObject);
			 testinsertRestaurant_review(cid[i].toString(), jsonObject);
		}
	}

	public void testInsertRestaurant(String cid, JSONObject jsonObject) {
		RestaurantVO vo = new RestaurantVO();
		String fulladdress;
		JSONObject basicInfo = (JSONObject) jsonObject.get("basicInfo");
		JSONObject address = (JSONObject) basicInfo.get("address");
		JSONObject newaddr = null;
		JSONObject region = (JSONObject) address.get("region");

		if (address.get("newaddr") != null) {
			newaddr = (JSONObject) address.get("newaddr");
			if (address.get("addrdetail") != null) {
				fulladdress = region.get("newaddrfullname") + " " + newaddr.get("newaddrfull") + " "
						+ address.get("addrdetail");
			} else if (newaddr.get("newaddrfull") != null) {
				fulladdress = region.get("newaddrfullname") + " " + newaddr.get("newaddrfull");
			} else {
				fulladdress = region.get("newaddrfullname").toString();
			}
		} else {
			fulladdress = null;
		}

		vo.setAddress(fulladdress);

		vo.setCid(Integer.parseInt(cid));
		if (basicInfo.get("openHour") != null) {
			JSONObject openHour = (JSONObject) basicInfo.get("openHour");
			JSONObject realtime = (JSONObject) openHour.get("realtime");

			if (openHour.get("periodList") != null) {
				JSONArray periodList = (JSONArray) openHour.get("periodList");
				JSONObject time = (JSONObject) periodList.get(0);
				JSONArray timeList = (JSONArray) time.get("timeList");
			}
		}

		vo.setCate1name(basicInfo.get("cate1name").toString());
		vo.setCatename(basicInfo.get("catename").toString());
		if (basicInfo.get("facilityInfo") != null) {
			JSONObject facilityInfo = (JSONObject) basicInfo.get("facilityInfo");
			if (facilityInfo.get("parking") != null) {
				if (facilityInfo.get("parking").equals("Y")) {
					vo.setParking("Y");
				} else if (facilityInfo.get("parking").equals("N")) {
					vo.setParking("N");
				}
			}

		}
		vo.setPlacename(basicInfo.get("placenamefull").toString());
		if (basicInfo.get("phonenum") != null) {
			vo.setPhonenum(basicInfo.get("phonenum").toString());
		}
		if (basicInfo.get("mainphotourl") != null) {
			vo.setMainphotourl(basicInfo.get("mainphotourl").toString());
		}
		mapper.insertRestaurant(vo);
		log.info("vo" + vo);
	}

	public void testInsertRestaurant_open(String cid, JSONObject jsonObject) {

		Restaurant_openHourVO vo = new Restaurant_openHourVO();

		JSONObject basicInfo = (JSONObject) jsonObject.get("basicInfo");

		vo.setCid(Integer.parseInt(cid));

		if (basicInfo.get("openHour") != null) {
			JSONObject openHour = (JSONObject) basicInfo.get("openHour");
			JSONObject realtime = (JSONObject) openHour.get("realtime");

			if (openHour.get("periodList") != null) {
				JSONArray periodList = (JSONArray) openHour.get("periodList");
				JSONObject time = (JSONObject) periodList.get(0);
				JSONArray timeList = (JSONArray) time.get("timeList");
				vo.setPeriodName(time.get("periodName").toString());
				for (int i = 0; i < timeList.size(); i++) {
					JSONObject otime = (JSONObject) timeList.get(i);
					vo.setTimeName(otime.get("timeName").toString());
					vo.setTimeSE(otime.get("timeSE").toString());
					if (otime.get("dayOfWeek") != null) {
						vo.setDayOfWeek(otime.get("dayOfWeek").toString());
					}
					log.info("vo : " + vo);

					mapper.insertRestaurant_open(vo);
				}
			} else {
				mapper.insertRestaurant_open(vo);
			}
			if (openHour.get("openhourDisplayText") != null) {
				vo.setOpenhourDisplayText(openHour.get("openhourDisplayText").toString());

			}

		} else {
			mapper.insertRestaurant_open(vo);
		}
	}

	public void testInsertRestaurant_off(String cid, JSONObject jsonObject) {
		Restaurant_offVO vo = new Restaurant_offVO();

		JSONObject basicInfo = (JSONObject) jsonObject.get("basicInfo");

		vo.setCid(Integer.parseInt(cid));

		if (basicInfo.get("openHour") != null) {
			JSONObject openHour = (JSONObject) basicInfo.get("openHour");

			JSONObject realtime = (JSONObject) openHour.get("realtime");
			if (openHour.get("periodList") != null) {
				JSONArray periodList = (JSONArray) openHour.get("periodList");
				JSONObject time = (JSONObject) periodList.get(0);
				JSONArray timeList = (JSONArray) time.get("timeList");
				if (openHour.get("offdayList") != null) {
					JSONArray offdayList = (JSONArray) openHour.get("offdayList");

					for (int i = 0; i < offdayList.size(); i++) {
						JSONObject holiday = (JSONObject) offdayList.get(i);
						vo.setHolydayName(holiday.get("holidayName").toString());
						if (holiday.get("weekAndDay") != null) {
							vo.setOffdate(holiday.get("weekAndDay").toString());
						}
						log.info(vo);
						mapper.insertRestaurant_off(vo);
					}
				} else {
					mapper.insertRestaurant_off(vo);
				}
			} else {
				mapper.insertRestaurant_off(vo);
			}

		} else {
			mapper.insertRestaurant_off(vo);
		}
	}

	public void testInsertRestaurant_menu(String cid, JSONObject jsonObject) {

		JSONObject menuInfo = (JSONObject) jsonObject.get("menuInfo");

		JSONObject basicInfo = (JSONObject) jsonObject.get("basicInfo");

		Restaurant_menuVO vo = new Restaurant_menuVO();
		vo.setCid(Integer.parseInt(cid));

		if (jsonObject.get("menuInfo") != null) {
			JSONArray menuList = (JSONArray) menuInfo.get("menuList");
			for (int i = 0; i < menuList.size(); i++) {
				JSONObject menu = (JSONObject) menuList.get(i);
				if (menu.get("menu") != null)
					vo.setMenu(menu.get("menu").toString());
				if (menu.get("price") != null)
					vo.setPrice(menu.get("price").toString());
				log.info("vo : " + vo);
				mapper.insertRestaurant_menu(vo);
			}
		} else {
			mapper.insertRestaurant_menu(vo);
		}
	}

	public void testinsertRestaurant_review(String cid, JSONObject jsonObject) {
		Restaurant_reviewVO vo = new Restaurant_reviewVO();
		vo.setCid(Integer.parseInt(cid));
		if (jsonObject.get("comment") != null) {

			JSONObject comment = (JSONObject) jsonObject.get("comment");
			if (comment.get("list") != null) {
				JSONArray commentlist = (JSONArray) comment.get("list");
				for (int i = 0; i < commentlist.size(); i++) {
					JSONObject list = (JSONObject) commentlist.get(i);
					if (list.get("photoList") != null) {
						JSONArray photoList = (JSONArray) list.get("photoList");
						vo.setRw_photo(photoList.get(0).toString());
						
					}else {
						vo.setRw_photo(null);
					}
					if (list.get("contents") != null) {
						vo.setRw_content(list.get("contents").toString());
					}
					if (list.get("username") != null) {
						if (Pattern.matches("^[0-9a-zA-Z가-힣]*", list.get("username").toString())) {
							vo.setRw_writer(list.get("username").toString());
						}

						else {
							vo.setRw_writer("익명");
						}
					}
					if (list.get("point") != null) {
						vo.setRw_rating(Double.parseDouble(list.get("point").toString()));
					}
					mapper.insertRestaurant_review(vo);
				}
			} else {
				mapper.insertRestaurant_review(vo);
			}
		} else {
			mapper.insertRestaurant_review(vo);
		}
		log.info("review" + vo);
	}

	public static JSONObject conAddr(String cid) {
		BufferedReader bufferedReader = null;
		JSONObject resultSet = null;
		try {
			String requesturl = "https://place.map.kakao.com/main/v/" + cid;
			URL url = new URL(requesturl);
			URLConnection conn = url.openConnection();
			bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			resultSet = parseJSONData(bufferedReader);

		}

		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {

			}
		}
		return resultSet;
	}

	// 데이터를 파싱하는 함수
	private static JSONObject parseJSONData(BufferedReader bufferedReader) {
		JSONObject resultSet = null;
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(bufferedReader);

			resultSet = jsonObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
}
