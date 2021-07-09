package org.zerock.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.RestaurantVO;
import org.zerock.domain.Restaurant_menuVO;
import org.zerock.domain.Restaurant_offVO;
import org.zerock.domain.Restaurant_openHourVO;
import org.zerock.service.RestaurantService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class CommonController2 {
	private RestaurantService service;
//	@GetMapping("/accessError")
//	public void accessDenied(Authentication auth, Model model) {
//		log.info("access Denied : " + auth);
//		model.addAttribute("msg", "Access Denied");
//	}
//
//	@GetMapping("/customLogin")
//	public String loginInput(String error, String logout, Model model) {
//		log.info("error: " + error);
//		log.info("logout: " + logout);
//
//		if (isAuthenticated()) {
//			return "redirect:/";
//		}
//
//		if (error != null) {
//			model.addAttribute("error", "아이디와 비밀번호를 확인하세요.");
//			return "customLogin";
//		}
//
//		if (logout != null) {
//			model.addAttribute("logout", "로그아웃 되었습니다.	");
//			return "customLogin";
//		}
//		return "customLogin";
//	}
//
//	@PreAuthorize("isAuthenticated()")
//	@GetMapping("/customLogout")
//	public void logoutGet() {
//		log.info("custom logout");
//	}
//
//	private boolean isAuthenticated() {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		if (authentication == null || AnonymousAuthenticationToken.class.isAssignableFrom(authentication.getClass())) {
//			return false;
//		}
//		return authentication.isAuthenticated();
//	}
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
	@GetMapping("/register")
	public void getregister() {

	}

	// @RequestParam(value="") List<Restaurant_menuVO> menuvo
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
	@PostMapping("/register")
	public String postregister(RestaurantVO vo, RedirectAttributes rttr, HttpServletRequest request) {
		log.info("================================");
		log.info("register: " + vo);
		service.registerRestaurant(vo);

		String[] periodName = request.getParameterValues("periodName");
		String[] timeName = request.getParameterValues("timeName");
		String[] timeSE = request.getParameterValues("timeSE");
		String[] dayOfWeek = request.getParameterValues("dayOfWeek");

		List<Restaurant_openHourVO> openvoList = new ArrayList<>();
		for (int i = 0; i < timeName.length; i++) {
			Restaurant_openHourVO openvo = new Restaurant_openHourVO();
			openvo.setCid(vo.getCid());
			if (periodName[i] == "") {
				periodName[i] = "영업기간";
			}
			openvo.setPeriodName(periodName[i]);
			openvo.setTimeName(timeName[i]);
			openvo.setTimeSE(timeSE[i]);
			openvo.setDayOfWeek(dayOfWeek[i]);
			openvoList.add(openvo);
		}

		service.registerRestaurantOpen(openvoList);

		String[] holydayName = request.getParameterValues("holydayName");
		String[] offdate = request.getParameterValues("offdate");

		List<Restaurant_offVO> offvoList = new ArrayList<>();
		for (int i = 0; i < holydayName.length; i++) {
			if (holydayName[i].equals("")) {
				holydayName[i] = null;
			}
			if (offdate[i].equals("")) {
				offdate[i] = null;
			}
			Restaurant_offVO offvo = new Restaurant_offVO();
			offvo.setHolydayName(holydayName[i]);
			offvo.setCid(vo.getCid());
			offvo.setOffdate(offdate[i]);
			offvoList.add(offvo);
		}
		service.registerRestaurantOff(offvoList);

		String[] menu = request.getParameterValues("menu");
		String[] price = request.getParameterValues("price");
		List<Restaurant_menuVO> menuvoList = new ArrayList<Restaurant_menuVO>();
		if (menu != null) {
			for (int i = 0; i < menu.length; i++) {
				Restaurant_menuVO menuvo = new Restaurant_menuVO();
				menuvo.setMenu(menu[i]);
				menuvo.setPrice(price[i]);
				menuvo.setCid(vo.getCid());
				menuvoList.add(menuvo);
			}
			service.registerRestaurantMenu(menuvoList);
		}

		return "redirect:/";
	}
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
	@GetMapping("/modify")
	public void getmodify(@RequestParam("cid") Integer cid, Model model) {
		log.info("cid : " + cid);
		model.addAttribute("cid",cid);
		model.addAttribute("Restaurant", service.getRestaurant(cid));

		model.addAttribute("open", service.getRestaurantOpen(cid));

		model.addAttribute("off", service.getRestaurantOff(cid));

		model.addAttribute("menu", service.getRestaurantMenu(cid));

		log.info("open : " + service.getRestaurantOpen(cid));
		log.info("off : " + service.getRestaurantOff(cid));
		log.info("menu : " + service.getRestaurantMenu(cid));

	}
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
	@PostMapping("/modify")
	public String postmodify(RestaurantVO vo, HttpServletRequest request) {
		vo.setCid(Integer.parseInt(request.getParameter("cid")));
		service.modifyRestaurant(vo);
		
		String[] periodName = request.getParameterValues("periodName");
		String[] timeName = request.getParameterValues("timeName");
		String[] timeSE = request.getParameterValues("timeSE");
		String[] dayOfWeek = request.getParameterValues("dayOfWeek");

		List<Restaurant_openHourVO> openvoList = new ArrayList<>();
		for (int i = 0; i < timeName.length; i++) {
			Restaurant_openHourVO openvo = new Restaurant_openHourVO();
			openvo.setCid(vo.getCid());
			if (periodName[i] == "") {
				periodName[i] = "영업기간";
			}
			openvo.setPeriodName(periodName[i]);
			openvo.setTimeName(timeName[i]);
			openvo.setTimeSE(timeSE[i]);
			openvo.setDayOfWeek(dayOfWeek[i]);
			openvoList.add(openvo);
		}

		service.modifyRestaurantOpen(openvoList);

		String[] holydayName = request.getParameterValues("holydayName");
		String[] offdate = request.getParameterValues("offdate");

		List<Restaurant_offVO> offvoList = new ArrayList<>();
		for (int i = 0; i < holydayName.length; i++) {
			if (holydayName[i].equals("")) {
				holydayName[i] = null;
			}
			if (offdate[i].equals("")) {
				offdate[i] = null;
			}
			Restaurant_offVO offvo = new Restaurant_offVO();
			offvo.setHolydayName(holydayName[i]);
			offvo.setCid(vo.getCid());
			offvo.setOffdate(offdate[i]);
			offvoList.add(offvo);
		}
		service.registerRestaurantOff(offvoList);

		String[] menu = request.getParameterValues("menu");
		String[] price = request.getParameterValues("price");
		List<Restaurant_menuVO> menuvoList = new ArrayList<Restaurant_menuVO>();
		if (menu != null) {
			for (int i = 0; i < menu.length; i++) {
				Restaurant_menuVO menuvo = new Restaurant_menuVO();
				menuvo.setMenu(menu[i]);
				menuvo.setPrice(price[i]);
				menuvo.setCid(vo.getCid());
				menuvoList.add(menuvo);
			}
			service.registerRestaurantMenu(menuvoList);
		}
		
		return "redirect:/";
	}

	@GetMapping("/main")
	public void asdf(Model model) {
		Integer[] cid = { 18668029, 697084504, 924229434, 2029556524 };
		for (int i = 0; i < cid.length; i++) {
			model.addAttribute("Restaurant" + i, service.getRestaurant(cid[i]));
		}
	}
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_MEMBER')")
	@GetMapping("/delete")
	public String delete(@RequestParam("cid") Integer cid,RedirectAttributes rttr) {
		service.removeRestaurant(cid);
		return "redirect:/main";
	}

	@GetMapping("/jsonParse")
	public void jsonParse(Model model, HttpServletRequest request) {

		Integer cid = Integer.parseInt(request.getParameter("cid"));
		// service.getRestaurant(2030217673);
		model.addAttribute("Restaurant", service.getRestaurant(cid));

		model.addAttribute("open", service.getRestaurantOpen(cid));

		model.addAttribute("off", service.getRestaurantOff(cid));

		model.addAttribute("menu", service.getRestaurantMenu(cid));

		model.addAttribute("review", service.getRestaurantReview(cid));

//		JSONObject jsonObject = conAddr();	
//		JSONObject basicInfo = (JSONObject) jsonObject.get("basicInfo");
//		JSONObject address = (JSONObject) basicInfo.get("address");
//		JSONObject newaddr = (JSONObject) address.get("newaddr");
//		JSONObject region = (JSONObject) address.get("region");
//		JSONObject openHour = (JSONObject) basicInfo.get("openHour");
//		JSONObject realtime = (JSONObject) openHour.get("realtime");
//		JSONArray periodList = (JSONArray) openHour.get("periodList");
//		JSONObject time = (JSONObject) periodList.get(0);
//		JSONArray timeList = (JSONArray) time.get("timeList");
//		
//		JSONObject menuInfo = (JSONObject) jsonObject.get("menuInfo");
//		
//		JSONArray menuList = (JSONArray) menuInfo.get("menuList");
//		
//		String fulladdress = region.get("newaddrfullname")+"" +newaddr.get("newaddrfull")+address.get("addrdetail");
//		
//		model.addAttribute("msg1", fulladdress);
//		model.addAttribute("msg2", basicInfo.get("placenamefull"));
//		model.addAttribute("msg3",basicInfo.get("phonenum"));
//		model.addAttribute("msg4",basicInfo.get("catename"));
//		model.addAttribute("msg5",realtime.get("open"));
//		if(realtime.get("open").equals("N")) {
//			model.addAttribute("msg5","영업전");
//		}
//		else if (realtime.get("open").equals("Y")){
//			model.addAttribute("msg5","영업중");
//			
//		}
//		
//		if(basicInfo.get("facilityInfo") != null) {
//			JSONObject facilityInfo = (JSONObject) basicInfo.get("facilityInfo");
//			if(facilityInfo.get("parking").equals("Y")) {
//				model.addAttribute("parking","주차가능");
//			} else if(facilityInfo.get("parking").equals("N")) {
//				model.addAttribute("parking","주차 불가");
//			}
//			
//		}
//		
//		model.addAttribute("msg6",time.get("periodName"));
//		
//		for(int i=0 ;  i <timeList.size(); i ++) {
//			JSONObject otime = (JSONObject) timeList.get(i);
//			model.addAttribute("timeName"+i,otime.get("timeName"));
//			model.addAttribute("timeSE"+i,otime.get("timeSE"));
//			model.addAttribute("dayOfWeek"+i,otime.get("dayOfWeek"));
//		}
//		if(openHour.get("offdayList") !=null) {
//			JSONArray offdayList = (JSONArray) openHour.get("offdayList");
//			model.addAttribute("holidayName","휴무일");
//			for(int i = 0; i < offdayList.size() ; i ++) {
//				JSONObject holiday = (JSONObject) offdayList.get(i);
//				model.addAttribute("holidayName"+i,holiday.get("holidayName"));
//			}
//		}
//		
//		if(openHour.get("openhourDisplayText") !=null) {
//			model.addAttribute("openhourDisplayText",openHour.get("openhourDisplayText"));
//			
//		}
//
//		
//		model.addAttribute("photourl",basicInfo.get("mainphotourl"));
//		
//		
//			for(int i =0 ; i <menuList.size(); i++) {
//				JSONObject menu = (JSONObject) menuList.get(i);
//				model.addAttribute("menu"+i,menu.get("menu"));
//				model.addAttribute("price"+i,menu.get("price"));
//				
//			}
		// model.addAttribute("menuboardphotourlList",menuboardphotourlList);

	}

	// 웹 사이트 자체가 JSON 객체로 저장되어 있어 웹에 있는 JSON을 가져오는 함수
	public static JSONObject conAddr() {
		BufferedReader bufferedReader = null;
		JSONObject resultSet = null;
		try {
			String requesturl = "https://place.map.kakao.com/main/v/911163785";
			URL url = new URL(requesturl);
			URLConnection conn = url.openConnection();
			bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			resultSet = parseJSONData(bufferedReader);
		} catch (MalformedURLException e) {
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