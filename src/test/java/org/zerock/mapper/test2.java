package org.zerock.mapper;


import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.SampleVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Configuration
@Log4j
public class test2 {
	
	@Setter(onMethod_ = @Autowired)
	private RestaurantMapper mapper;
	
	@Test
	public void asdf() {
		String a = "2021\\07\\12";
		a = a.replace("\\", "/");
		log.info(a);
	}


	
	
}
