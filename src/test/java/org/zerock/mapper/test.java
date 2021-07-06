package org.zerock.mapper;


import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Configuration
@Log4j
public class test {
	
	
	public static String[] asdf() {
		String json = "{"+"\"posts\" : [\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"16086014\",\r\n" + 
				"        \"x\": 465424,\r\n" + 
				"        \"y\": 1123292,\r\n" + 
				"        \"name\": \"영양족발순대국\",\r\n" + 
				"        \"tel\": \"02-2699-7914\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 98-154 화곡본동시장 가-3호\",\r\n" + 
				"        \"reviewCount\": 317,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/7BF6AB64310C49E09DAF2AA7DE9B0CA7\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119305050|126|-3|||465352|1123332|0\",\r\n" + 
				"        \"full_category_ids\": \"9|124|507\",\r\n" + 
				"        \"last_cate_id\": \"507\",\r\n" + 
				"        \"last_cate_name\": \"순대\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"순대\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"순대\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"0507-1319-7914\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 초록마을로2길 48\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"t7|2704회|20201124\",\r\n" + 
				"        \"tvshow_name\": \"SBS 생방송 투데이\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|98-154|화곡본동시장 가-3호\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||초록마을로2길|48|화곡본동시장 가-3호\",\r\n" + 
				"        \"distance\": \"457\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07721\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"족발\",\r\n" + 
				"            \"순대국\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 4.1,\r\n" + 
				"        \"rating_count\": 119,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 798060,\r\n" + 
				"                \"kid\": 1001100101849,\r\n" + 
				"                \"name\": \"입구1\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.84331,\r\n" + 
				"                \"y\": 37.543495\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"id\": 798061,\r\n" + 
				"                \"kid\": 1001100101849,\r\n" + 
				"                \"name\": \"입구2\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.84333,\r\n" + 
				"                \"y\": 37.54273\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"16091081\",\r\n" + 
				"        \"x\": 463823,\r\n" + 
				"        \"y\": 1122384,\r\n" + 
				"        \"name\": \"다채우렁돌솥쌈밥\",\r\n" + 
				"        \"tel\": \"02-2608-0008\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1072-10 \",\r\n" + 
				"        \"reviewCount\": 42,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/localfiy/3A044E672352430A85CB6347A7C3AA5E\",\r\n" + 
				"        \"sourceId\": \"ad\",\r\n" + 
				"        \"source\": \"ad\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119312235|257|-1|||463861|1122393|-3\",\r\n" + 
				"        \"full_category_ids\": \"9|124|404\",\r\n" + 
				"        \"last_cate_id\": \"404\",\r\n" + 
				"        \"last_cate_name\": \"쌈밥\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"쌈밥\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"쌈밥\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로20길 12\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1072-10|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로20길|12|\",\r\n" + 
				"        \"distance\": \"340\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07718\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"갈치속젓\",\r\n" + 
				"            \"우렁쌈장\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 4.1,\r\n" + 
				"        \"rating_count\": 25,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"Y\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"Y\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"20942557\",\r\n" + 
				"        \"x\": 465452,\r\n" + 
				"        \"y\": 1123126,\r\n" + 
				"        \"name\": \"원조동글갈비\",\r\n" + 
				"        \"tel\": \"02-2602-9923\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 98-238 \",\r\n" + 
				"        \"reviewCount\": 72,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/0658AFC4397D4931819F026500D8F8B1\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119093235|48|3|||465432|1123119|0\",\r\n" + 
				"        \"full_category_ids\": \"9|124|18165|929\",\r\n" + 
				"        \"last_cate_id\": \"929\",\r\n" + 
				"        \"last_cate_name\": \"갈비\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"육류,고기\",\r\n" + 
				"        \"cate_name_depth4\": \"갈비\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"갈비\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 194-15\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|98-238|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|194-15|\",\r\n" + 
				"        \"distance\": \"461\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07721\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"돼지갈비\",\r\n" + 
				"            \"양념갈비\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 3,\r\n" + 
				"        \"rating_count\": 52,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 1761427,\r\n" + 
				"                \"kid\": 0,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.843285,\r\n" + 
				"                \"y\": 37.54282\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"1249470554\",\r\n" + 
				"        \"x\": 464443,\r\n" + 
				"        \"y\": 1122943,\r\n" + 
				"        \"name\": \"올바른스시 화곡역점\",\r\n" + 
				"        \"tel\": \"02-2605-5556\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1050-33 3동 1층\",\r\n" + 
				"        \"reviewCount\": 97,\r\n" + 
				"        \"homepage\": \"https://sushiolleh.modoo.at\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/localfiy/BEEB2D6BDFC743EEAD3E397A66349594\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1093805532|299|4|||464459|1122934|-2\",\r\n" + 
				"        \"full_category_ids\": \"9|84|270\",\r\n" + 
				"        \"last_cate_id\": \"270\",\r\n" + 
				"        \"last_cate_name\": \"초밥,롤\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"일식\",\r\n" + 
				"        \"cate_name_depth3\": \"초밥,롤\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"초밥,롤\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로33길 12\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1050-33|3동 1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로33길|12|3동 1층\",\r\n" + 
				"        \"distance\": \"82\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07713\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"연어샐러드\",\r\n" + 
				"            \"초밥\",\r\n" + 
				"            \"뚝배기\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 4.4,\r\n" + 
				"        \"rating_count\": 24,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"Y\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"점심특선|혼밥|혼술\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"178037054\",\r\n" + 
				"        \"x\": 462919,\r\n" + 
				"        \"y\": 1122330,\r\n" + 
				"        \"name\": \"금화왕돈까스 신월점\",\r\n" + 
				"        \"tel\": \"02-2635-9992\",\r\n" + 
				"        \"address\": \"서울 양천구 신월동 24-7 1층\",\r\n" + 
				"        \"reviewCount\": 201,\r\n" + 
				"        \"homepage\": \"http://kumhwaking.co.kr/\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/0EDFD72E9DEC461FB43148D84D2B8400\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119272991|239|-6|||462960|1122355|1\",\r\n" + 
				"        \"full_category_ids\": \"9|84|596\",\r\n" + 
				"        \"last_cate_id\": \"596\",\r\n" + 
				"        \"last_cate_name\": \"돈까스,우동\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"일식\",\r\n" + 
				"        \"cate_name_depth3\": \"돈까스,우동\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"돈까스,우동\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 양천구 화곡로 91\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|양천구|신월동|24-7|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|양천구||화곡로|91|1층\",\r\n" + 
				"        \"distance\": \"630\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07902\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"왕돈가스\",\r\n" + 
				"            \"김밥\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 3,\r\n" + 
				"        \"rating_count\": 30,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"경양식요리\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"608638929\",\r\n" + 
				"        \"x\": 464112,\r\n" + 
				"        \"y\": 1122553,\r\n" + 
				"        \"name\": \"긴자스시\",\r\n" + 
				"        \"tel\": \"02-2695-7778\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1073-10 1층 115호\",\r\n" + 
				"        \"reviewCount\": 112,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/528B5AAEF93F49A5BE463067869514E7\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119304372|159|2|||464092|1122605|1\",\r\n" + 
				"        \"full_category_ids\": \"9|84|270\",\r\n" + 
				"        \"last_cate_id\": \"270\",\r\n" + 
				"        \"last_cate_name\": \"초밥,롤\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"일식\",\r\n" + 
				"        \"cate_name_depth3\": \"초밥,롤\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"초밥,롤\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 142\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1073-10|1층 115호\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|142|1층 115호\",\r\n" + 
				"        \"distance\": \"227\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07715\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"초밥\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 4.2,\r\n" + 
				"        \"rating_count\": 13,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"데이트코스|혼밥\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 801981,\r\n" + 
				"                \"kid\": 1001100625569,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.837585,\r\n" + 
				"                \"y\": 37.540745\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"id\": 801980,\r\n" + 
				"                \"kid\": 1001100625569,\r\n" + 
				"                \"name\": \"주차장\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"PARKING\",\r\n" + 
				"                \"x\": 126.8375,\r\n" + 
				"                \"y\": 37.54024\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"16764416\",\r\n" + 
				"        \"x\": 463696,\r\n" + 
				"        \"y\": 1124488,\r\n" + 
				"        \"name\": \"충북식당\",\r\n" + 
				"        \"tel\": \"02-2697-1475\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1006-5 \",\r\n" + 
				"        \"reviewCount\": 80,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/2DBA83A5C45C4FB8A63BF4FC1F4E66DD\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119361133|8|6|||463694|1124473|-3\",\r\n" + 
				"        \"full_category_ids\": \"9|124\",\r\n" + 
				"        \"last_cate_id\": \"124\",\r\n" + 
				"        \"last_cate_name\": \"한식\",\r\n" + 
				"        \"last_cate_depth\": \"2\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"한식\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로45가길 9\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1006-5|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로45가길|9|\",\r\n" + 
				"        \"distance\": \"608\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07705\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"제육볶음\",\r\n" + 
				"            \"오징어볶음\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 3,\r\n" + 
				"        \"rating_count\": 51,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"혼밥\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"471009192\",\r\n" + 
				"        \"x\": 463874,\r\n" + 
				"        \"y\": 1122615,\r\n" + 
				"        \"name\": \"어촌어시장 화곡점\",\r\n" + 
				"        \"tel\": \"02-2690-0284\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1067-20 \",\r\n" + 
				"        \"reviewCount\": 21,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/9AAD331F48124ECA954B684E3266CE7F\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119301381|329|0|||463895|1122577|0\",\r\n" + 
				"        \"full_category_ids\": \"9|124|728|822\",\r\n" + 
				"        \"last_cate_id\": \"822\",\r\n" + 
				"        \"last_cate_name\": \"회\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"해물,생선\",\r\n" + 
				"        \"cate_name_depth4\": \"회\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"회\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 133\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1067-20|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|133|\",\r\n" + 
				"        \"distance\": \"255\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07712\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 3,\r\n" + 
				"        \"rating_count\": 8,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 798156,\r\n" + 
				"                \"kid\": 1001100103940,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.83659,\r\n" + 
				"                \"y\": 37.540733\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"20540187\",\r\n" + 
				"        \"x\": 464184,\r\n" + 
				"        \"y\": 1123465,\r\n" + 
				"        \"name\": \"김희라 한국식왕돈까스\",\r\n" + 
				"        \"tel\": \"02-2601-0636\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1032-25 \",\r\n" + 
				"        \"reviewCount\": 34,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/E7754FB072374F128D1A53D0D0E29258\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119282585|215|-1|||464203|1123519|2\",\r\n" + 
				"        \"full_category_ids\": \"9|84|596\",\r\n" + 
				"        \"last_cate_id\": \"596\",\r\n" + 
				"        \"last_cate_name\": \"돈까스,우동\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"일식\",\r\n" + 
				"        \"cate_name_depth3\": \"돈까스,우동\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"돈까스,우동\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로 201\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1032-25|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로|201|\",\r\n" + 
				"        \"distance\": \"156\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07707\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"왕돈가스\",\r\n" + 
				"            \"스파게티\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 4,\r\n" + 
				"        \"rating_count\": 20,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"경양식요리|혼밥\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"1866388998\",\r\n" + 
				"        \"x\": 463935,\r\n" + 
				"        \"y\": 1124268,\r\n" + 
				"        \"name\": \"중식이맛있는집 메이탄 강서점\",\r\n" + 
				"        \"tel\": \"02-2699-8686\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1165-1 강서힐스테이트상가 215호\",\r\n" + 
				"        \"reviewCount\": 105,\r\n" + 
				"        \"homepage\": \"http://gsmeitan.modoo.at\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/localad_thumb/t/9066bd38df01fc7456770fbff1e1851401717f73\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119289551|75|-6|||463861|1124250|1\",\r\n" + 
				"        \"full_category_ids\": \"9|2810|597\",\r\n" + 
				"        \"last_cate_id\": \"597\",\r\n" + 
				"        \"last_cate_name\": \"중화요리\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"중식\",\r\n" + 
				"        \"cate_name_depth3\": \"중화요리\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"중화요리\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로 242\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1165-1|강서힐스테이트상가 215호\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로|242|강서힐스테이트상가 215호\",\r\n" + 
				"        \"distance\": \"492\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07694\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"게살스프\",\r\n" + 
				"            \"오징어\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 4.1,\r\n" + 
				"        \"rating_count\": 26,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"Y\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"Y\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"Y\",\r\n" + 
				"        \"meta_keywords_disp\": \"상견례|친목모임|코스요리|회식장소\",\r\n" + 
				"        \"issue_keywords_disp\": \"안심식당\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"26453554\",\r\n" + 
				"        \"x\": 463518,\r\n" + 
				"        \"y\": 1122375,\r\n" + 
				"        \"name\": \"베이징 화곡본점\",\r\n" + 
				"        \"tel\": \"02-2699-7275\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1070-44 \",\r\n" + 
				"        \"reviewCount\": 13,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/D3706B5B974C4EAFACDF76499595908D\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119304087|145|-6|||463496|1122406|0\",\r\n" + 
				"        \"full_category_ids\": \"9|2810|597\",\r\n" + 
				"        \"last_cate_id\": \"597\",\r\n" + 
				"        \"last_cate_name\": \"중화요리\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"중식\",\r\n" + 
				"        \"cate_name_depth3\": \"중화요리\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"중화요리\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"02-2699-7278(팩스) 02-2699-7276\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 118\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1070-44|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|118|\",\r\n" + 
				"        \"distance\": \"423\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07718\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 3.4,\r\n" + 
				"        \"rating_count\": 18,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"돌잔치|친목모임|코스요리\",\r\n" + 
				"        \"issue_keywords_disp\": \"안심식당\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 2037071,\r\n" + 
				"                \"kid\": 0,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.83494,\r\n" + 
				"                \"y\": 37.539963\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"1075845976\",\r\n" + 
				"        \"x\": 464285,\r\n" + 
				"        \"y\": 1122892,\r\n" + 
				"        \"name\": \"이현우스시\",\r\n" + 
				"        \"tel\": \"02-2699-0020\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1050-37 1층\",\r\n" + 
				"        \"reviewCount\": 174,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/39294AD52E0D41558D84BD46EC00AE6C\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1093805546|324|3|||464295|1122878|-3\",\r\n" + 
				"        \"full_category_ids\": \"9|84|270\",\r\n" + 
				"        \"last_cate_id\": \"270\",\r\n" + 
				"        \"last_cate_name\": \"초밥,롤\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"일식\",\r\n" + 
				"        \"cate_name_depth3\": \"초밥,롤\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"초밥,롤\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로33길 26\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1050-37|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로33길|26|1층\",\r\n" + 
				"        \"distance\": \"79\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07713\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 4,\r\n" + 
				"        \"rating_count\": 14,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"N\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"Y\",\r\n" + 
				"        \"meta_keywords_disp\": \"데이트코스\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"26617152\",\r\n" + 
				"        \"x\": 464076,\r\n" + 
				"        \"y\": 1122549,\r\n" + 
				"        \"name\": \"스타벅스 화곡동점\",\r\n" + 
				"        \"tel\": \"1522-3232\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1073-10 \",\r\n" + 
				"        \"reviewCount\": 14,\r\n" + 
				"        \"homepage\": \"http://www.starbucks.co.kr\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/FA7FDA0D6DB54A22ADCBD2C6042612D5\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119304360|171|-9|||464068|1122597|0\",\r\n" + 
				"        \"full_category_ids\": \"9|86|28|174\",\r\n" + 
				"        \"last_cate_id\": \"174\",\r\n" + 
				"        \"last_cate_name\": \"스타벅스\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"카페\",\r\n" + 
				"        \"cate_name_depth3\": \"커피전문점\",\r\n" + 
				"        \"cate_name_depth4\": \"스타벅스\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"스타벅스\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 142\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1073-10|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|142|\",\r\n" + 
				"        \"distance\": \"234\",\r\n" + 
				"        \"catetype\": \"G\",\r\n" + 
				"        \"new_zipcode\": \"07715\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 3.2,\r\n" + 
				"        \"rating_count\": 9,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"Y\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"카카오페이\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 801981,\r\n" + 
				"                \"kid\": 1001100625569,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.837585,\r\n" + 
				"                \"y\": 37.540745\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"id\": 801980,\r\n" + 
				"                \"kid\": 1001100625569,\r\n" + 
				"                \"name\": \"주차장\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"PARKING\",\r\n" + 
				"                \"x\": 126.8375,\r\n" + 
				"                \"y\": 37.54024\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"1985803908\",\r\n" + 
				"        \"x\": 463483,\r\n" + 
				"        \"y\": 1122509,\r\n" + 
				"        \"name\": \"소담촌 화곡점\",\r\n" + 
				"        \"tel\": \"02-2699-0055\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1068-25 1층\",\r\n" + 
				"        \"reviewCount\": 35,\r\n" + 
				"        \"homepage\": \"http://www.sodamchon.com/\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/AC3C1F89ADD343539031FBE02111FFD3\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119301576|337|-5|||463509|1122447|2\",\r\n" + 
				"        \"full_category_ids\": \"9|630\",\r\n" + 
				"        \"last_cate_id\": \"630\",\r\n" + 
				"        \"last_cate_name\": \"샤브샤브\",\r\n" + 
				"        \"last_cate_depth\": \"2\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"샤브샤브\",\r\n" + 
				"        \"cate_name_depth3\": \"\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"샤브샤브\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 117\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1068-25|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|117|1층\",\r\n" + 
				"        \"distance\": \"400\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07711\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"샤브샤브\",\r\n" + 
				"            \"칼국수\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 2.9,\r\n" + 
				"        \"rating_count\": 17,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"가족모임|점심식사|점심특선|친목모임\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 2319449,\r\n" + 
				"                \"kid\": 0,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.83479,\r\n" + 
				"                \"y\": 37.540257\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"20631070\",\r\n" + 
				"        \"x\": 463426,\r\n" + 
				"        \"y\": 1122455,\r\n" + 
				"        \"name\": \"김종용누룽지통닭 화곡본점\",\r\n" + 
				"        \"tel\": \"02-6405-9292\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1068-31 1층\",\r\n" + 
				"        \"reviewCount\": 49,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/BB6426FB7EA64E4E90DDCF5E4187795E\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119301617|342|-1|||463436|1122423|2\",\r\n" + 
				"        \"full_category_ids\": \"9|124|18165|181\",\r\n" + 
				"        \"last_cate_id\": \"181\",\r\n" + 
				"        \"last_cate_name\": \"닭요리\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"육류,고기\",\r\n" + 
				"        \"cate_name_depth4\": \"닭요리\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"nice\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"닭요리\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 113\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1068-31|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|113|1층\",\r\n" + 
				"        \"distance\": \"432\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07711\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"누룽지통닭\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 4.1,\r\n" + 
				"        \"rating_count\": 42,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 182409,\r\n" + 
				"                \"kid\": 1001100112936,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.83446,\r\n" + 
				"                \"y\": 37.54016\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }\r\n" + 
				"]"
				+"}"
				;
		
		
		String json1 = "{"+" \"posts\" : [\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"1075845976\",\r\n" + 
				"        \"x\": 464285,\r\n" + 
				"        \"y\": 1122892,\r\n" + 
				"        \"name\": \"이현우스시\",\r\n" + 
				"        \"tel\": \"02-2699-0020\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1050-37 1층\",\r\n" + 
				"        \"reviewCount\": 174,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/39294AD52E0D41558D84BD46EC00AE6C\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1093805546|324|3|||464295|1122878|-3\",\r\n" + 
				"        \"full_category_ids\": \"9|84|270\",\r\n" + 
				"        \"last_cate_id\": \"270\",\r\n" + 
				"        \"last_cate_name\": \"초밥,롤\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"일식\",\r\n" + 
				"        \"cate_name_depth3\": \"초밥,롤\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"초밥,롤\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로33길 26\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1050-37|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로33길|26|1층\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07713\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 4,\r\n" + 
				"        \"rating_count\": 14,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"N\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"Y\",\r\n" + 
				"        \"meta_keywords_disp\": \"데이트코스\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"24005099\",\r\n" + 
				"        \"x\": 464263,\r\n" + 
				"        \"y\": 1122595,\r\n" + 
				"        \"name\": \"신선설농탕 화곡역점\",\r\n" + 
				"        \"tel\": \"02-2693-1600\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1074 \",\r\n" + 
				"        \"reviewCount\": 14,\r\n" + 
				"        \"homepage\": \"http://www.kood.co.kr\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/302B6FF7A8FF484BBCF4E8CC8DE6DEB1\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119304437|165|-3|||464211|1122647|3\",\r\n" + 
				"        \"full_category_ids\": \"9|124|823\",\r\n" + 
				"        \"last_cate_id\": \"823\",\r\n" + 
				"        \"last_cate_name\": \"설렁탕\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"설렁탕\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"설렁탕\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 148\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1074|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|148|\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07715\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 3.2,\r\n" + 
				"        \"rating_count\": 10,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 1836108,\r\n" + 
				"                \"kid\": 0,\r\n" + 
				"                \"name\": \"입구\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"\",\r\n" + 
				"                \"x\": 126.83812,\r\n" + 
				"                \"y\": 37.540894\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"10348118\",\r\n" + 
				"        \"x\": 464245,\r\n" + 
				"        \"y\": 1123342,\r\n" + 
				"        \"name\": \"명가원설농탕 화곡점\",\r\n" + 
				"        \"tel\": \"02-2693-0055\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1032-19 \",\r\n" + 
				"        \"reviewCount\": 13,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/52590FEF2E4040639C2D1770B416445B\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119282690|229|-5|||464298|1123397|1\",\r\n" + 
				"        \"full_category_ids\": \"9|124|823\",\r\n" + 
				"        \"last_cate_id\": \"823\",\r\n" + 
				"        \"last_cate_name\": \"설렁탕\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"설렁탕\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"설렁탕\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로 195\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1032-19|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로|195|\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07707\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"갈비탕\",\r\n" + 
				"            \"설농탕\",\r\n" + 
				"            \"설렁탕\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 2.9,\r\n" + 
				"        \"rating_count\": 17,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"24시간식당|가족모임|점심식사\",\r\n" + 
				"        \"issue_keywords_disp\": \"안심식당\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"26867540\",\r\n" + 
				"        \"x\": 464280,\r\n" + 
				"        \"y\": 1122546,\r\n" + 
				"        \"name\": \"일층집의정부부대찌개\",\r\n" + 
				"        \"tel\": \"02-2692-3877\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1074-2 \",\r\n" + 
				"        \"reviewCount\": 29,\r\n" + 
				"        \"homepage\": \"https://www.kookandcook.com/\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/FEE342E016284D488441A5DF79022D83\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119312274|43|2|||464260|1122529|0\",\r\n" + 
				"        \"full_category_ids\": \"9|124|510\",\r\n" + 
				"        \"last_cate_id\": \"510\",\r\n" + 
				"        \"last_cate_name\": \"찌개,전골\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"찌개,전골\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"찌개,전골\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"02-6014-5503\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로26가길 32\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1074-2|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로26가길|32|\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07715\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"부대찌개\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 3.3,\r\n" + 
				"        \"rating_count\": 23,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"점심식사\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"2076833804\",\r\n" + 
				"        \"x\": 464352,\r\n" + 
				"        \"y\": 1122635,\r\n" + 
				"        \"name\": \"크리스피크림도넛 화곡역점\",\r\n" + 
				"        \"tel\": \"02-2602-1937\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1074-7 1층\",\r\n" + 
				"        \"reviewCount\": 11,\r\n" + 
				"        \"homepage\": \"http://www.krispykreme.co.kr\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/localfiy/38B91681781644478CC997336700F6FE\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119304493|139|-4|||464311|1122684|3\",\r\n" + 
				"        \"full_category_ids\": \"9|46|791|1159\",\r\n" + 
				"        \"last_cate_id\": \"1159\",\r\n" + 
				"        \"last_cate_name\": \"크리스피크림도넛\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"간식\",\r\n" + 
				"        \"cate_name_depth3\": \"도넛\",\r\n" + 
				"        \"cate_name_depth4\": \"크리스피크림도넛\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"크리스피크림도넛\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 152\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1074-7|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|152|1층\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"G\",\r\n" + 
				"        \"new_zipcode\": \"07715\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 4,\r\n" + 
				"        \"rating_count\": 2,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"Y\",\r\n" + 
				"        \"addinfo_fordisabled\": \"N\",\r\n" + 
				"        \"addinfo_nursery\": \"N\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"Y\",\r\n" + 
				"        \"addinfo_pet\": \"N\",\r\n" + 
				"        \"addinfo_smokingroom\": \"N\",\r\n" + 
				"        \"addinfo_wifi\": \"Y\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"카카오페이\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"16271313\",\r\n" + 
				"        \"x\": 464277,\r\n" + 
				"        \"y\": 1122829,\r\n" + 
				"        \"name\": \"맛거리\",\r\n" + 
				"        \"tel\": \"02-2602-9997\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1065 \",\r\n" + 
				"        \"reviewCount\": 32,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/1989D627006643408557A1AE20C2C069\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119354092|73|1|||464265|1122830|0\",\r\n" + 
				"        \"full_category_ids\": \"9|83|593\",\r\n" + 
				"        \"last_cate_id\": \"593\",\r\n" + 
				"        \"last_cate_name\": \"호프,요리주점\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"술집\",\r\n" + 
				"        \"cate_name_depth3\": \"호프,요리주점\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"호프,요리주점\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로25길 8\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1065|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로25길|8|\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07714\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"막걸리\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 3.8,\r\n" + 
				"        \"rating_count\": 14,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"혼술\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"27288988\",\r\n" + 
				"        \"x\": 464316,\r\n" + 
				"        \"y\": 1122913,\r\n" + 
				"        \"name\": \"굴천지&초계국수 화곡직영점\",\r\n" + 
				"        \"tel\": \"02-2603-9916\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1050-36 해피빌딩 1층\",\r\n" + 
				"        \"reviewCount\": 12,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/cfile/250DC637564971532E\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1093805544|356|-8|||464318|1122887|0\",\r\n" + 
				"        \"full_category_ids\": \"9|124|819\",\r\n" + 
				"        \"last_cate_id\": \"819\",\r\n" + 
				"        \"last_cate_name\": \"국수\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"국수\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"국수\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로33길 24\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1050-36|해피빌딩 1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로33길|24|해피빌딩 1층\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07713\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 3.3,\r\n" + 
				"        \"rating_count\": 3,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"혼밥\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"17092510\",\r\n" + 
				"        \"x\": 464354,\r\n" + 
				"        \"y\": 1122923,\r\n" + 
				"        \"name\": \"본가왕해물찜\",\r\n" + 
				"        \"tel\": \"02-2697-0774\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1050-34 \",\r\n" + 
				"        \"reviewCount\": 2,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/FD1ED0FB298249608E11E5725A1BC1B2\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1093805541|332|-5|||464365|1122900|0\",\r\n" + 
				"        \"full_category_ids\": \"9|124|728\",\r\n" + 
				"        \"last_cate_id\": \"728\",\r\n" + 
				"        \"last_cate_name\": \"해물,생선\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"한식\",\r\n" + 
				"        \"cate_name_depth3\": \"해물,생선\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"해물,생선\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로33길 20\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1050-34|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로33길|20|\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07713\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"N\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 4.2,\r\n" + 
				"        \"rating_count\": 5,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"26582884\",\r\n" + 
				"        \"x\": 464307,\r\n" + 
				"        \"y\": 1122760,\r\n" + 
				"        \"name\": \"니뽕내뽕 화곡역점\",\r\n" + 
				"        \"tel\": \"02-2603-2848\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1065-1 203호\",\r\n" + 
				"        \"reviewCount\": 29,\r\n" + 
				"        \"homepage\": \"http://www.nipongnaepong.co.kr\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/9A644D7662AB46559F85204C7AC494DE\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119354041|80|1|||464288|1122757|-3\",\r\n" + 
				"        \"full_category_ids\": \"9|474|22238\",\r\n" + 
				"        \"last_cate_id\": \"22238\",\r\n" + 
				"        \"last_cate_name\": \"니뽕내뽕\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"퓨전요리\",\r\n" + 
				"        \"cate_name_depth3\": \"니뽕내뽕\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"니뽕내뽕\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로25길 2\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1065-1|203호\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로25길|2|203호\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"G\",\r\n" + 
				"        \"new_zipcode\": \"07714\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [\r\n" + 
				"            \"크뽕\",\r\n" + 
				"            \"피자\"\r\n" + 
				"        ],\r\n" + 
				"        \"rating_average\": 2.6,\r\n" + 
				"        \"rating_count\": 15,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"1500667565\",\r\n" + 
				"        \"x\": 464310,\r\n" + 
				"        \"y\": 1122759,\r\n" + 
				"        \"name\": \"빽다방 화곡역점\",\r\n" + 
				"        \"tel\": \"02-2606-1117\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1065-1 1층\",\r\n" + 
				"        \"reviewCount\": 5,\r\n" + 
				"        \"homepage\": \"http://paikdabang.com\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/E85505ADBA924740A5B89D4341D5D255\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119354041|86|-1|||464288|1122757|-3\",\r\n" + 
				"        \"full_category_ids\": \"9|86|28|22285\",\r\n" + 
				"        \"last_cate_id\": \"22285\",\r\n" + 
				"        \"last_cate_name\": \"빽다방\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"카페\",\r\n" + 
				"        \"cate_name_depth3\": \"커피전문점\",\r\n" + 
				"        \"cate_name_depth4\": \"빽다방\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"빽다방\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로25길 2\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1065-1|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로25길|2|1층\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"G\",\r\n" + 
				"        \"new_zipcode\": \"07714\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 2.3,\r\n" + 
				"        \"rating_count\": 3,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"Y\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"카카오페이\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"16993497\",\r\n" + 
				"        \"x\": 464263,\r\n" + 
				"        \"y\": 1122740,\r\n" + 
				"        \"name\": \"배스킨라빈스 화곡역점\",\r\n" + 
				"        \"tel\": \"02-2603-8217\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1066-20 \",\r\n" + 
				"        \"reviewCount\": 8,\r\n" + 
				"        \"homepage\": \"http://www.baskinrobbins.co.kr\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/186B5B2436C840F0BB405963FA63A3B3\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119301201|359|-2|||464264|1122698|0\",\r\n" + 
				"        \"full_category_ids\": \"9|46|267|1673\",\r\n" + 
				"        \"last_cate_id\": \"1673\",\r\n" + 
				"        \"last_cate_name\": \"배스킨라빈스\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"간식\",\r\n" + 
				"        \"cate_name_depth3\": \"아이스크림\",\r\n" + 
				"        \"cate_name_depth4\": \"배스킨라빈스\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"배스킨라빈스\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 149\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1066-20|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|149|\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"G\",\r\n" + 
				"        \"new_zipcode\": \"07714\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 1.9,\r\n" + 
				"        \"rating_count\": 10,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"카카오페이\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 798371,\r\n" + 
				"                \"kid\": 1001100108103,\r\n" + 
				"                \"name\": \"주차장\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"PARKING\",\r\n" + 
				"                \"x\": 126.838295,\r\n" + 
				"                \"y\": 37.541363\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"26626445\",\r\n" + 
				"        \"x\": 464324,\r\n" + 
				"        \"y\": 1122754,\r\n" + 
				"        \"name\": \"본죽&비빔밥cafe 화곡역점\",\r\n" + 
				"        \"tel\": \"02-2695-3788\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1065-1 KBH타워 2층 202호\",\r\n" + 
				"        \"reviewCount\": 5,\r\n" + 
				"        \"homepage\": \"https://www.bonif.co.kr/bonCafe/home\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/6D094807D5484B4496DA08FE88144CB8\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119301161|352|-5|||464330|1122721|1\",\r\n" + 
				"        \"full_category_ids\": \"9|474|406|17207\",\r\n" + 
				"        \"last_cate_id\": \"17207\",\r\n" + 
				"        \"last_cate_name\": \"본죽&비빔밥cafe\",\r\n" + 
				"        \"last_cate_depth\": \"4\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"퓨전요리\",\r\n" + 
				"        \"cate_name_depth3\": \"퓨전한식\",\r\n" + 
				"        \"cate_name_depth4\": \"본죽&비빔밥cafe\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"본죽&비빔밥cafe\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로25길 2\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1065-1|KBH타워 2층 202호\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로25길|2|KBH타워 2층 202호\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"G\",\r\n" + 
				"        \"new_zipcode\": \"07714\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 2.1,\r\n" + 
				"        \"rating_count\": 7,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"죽전문점\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"537814491\",\r\n" + 
				"        \"x\": 464307,\r\n" + 
				"        \"y\": 1122839,\r\n" + 
				"        \"name\": \"내고향왕만두\",\r\n" + 
				"        \"tel\": \"02-2696-4209\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1065-2 \",\r\n" + 
				"        \"reviewCount\": 4,\r\n" + 
				"        \"homepage\": \"\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/E0CC6DC7E35E44C3B3C7E4CCD066984D\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1093805546|163|-10|||464295|1122878|0\",\r\n" + 
				"        \"full_category_ids\": \"9|296\",\r\n" + 
				"        \"last_cate_id\": \"296\",\r\n" + 
				"        \"last_cate_name\": \"분식\",\r\n" + 
				"        \"last_cate_depth\": \"2\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"분식\",\r\n" + 
				"        \"cate_name_depth3\": \"\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"분식\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 강서로33길 27\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1065-2|\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||강서로33길|27|\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07714\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"N\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 0,\r\n" + 
				"        \"rating_count\": 0,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"96246214\",\r\n" + 
				"        \"x\": 464246,\r\n" + 
				"        \"y\": 1122749,\r\n" + 
				"        \"name\": \"텬고 화곡역점\",\r\n" + 
				"        \"tel\": \"02-6012-1009\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1066-20 심당빌딩 2층\",\r\n" + 
				"        \"reviewCount\": 3,\r\n" + 
				"        \"homepage\": \"https://www.instagram.com/turn_go_hwagok/\",\r\n" + 
				"        \"img\": \"http://t1.daumcdn.net/place/0A3F946485F6479199786F6A46A65345\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119354041|299|0|||464288|1122757|1\",\r\n" + 
				"        \"full_category_ids\": \"9|296|18157\",\r\n" + 
				"        \"last_cate_id\": \"18157\",\r\n" + 
				"        \"last_cate_name\": \"떡볶이\",\r\n" + 
				"        \"last_cate_depth\": \"3\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"분식\",\r\n" + 
				"        \"cate_name_depth3\": \"떡볶이\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"떡볶이\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로 149\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1066-20|심당빌딩 2층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로|149|심당빌딩 2층\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07714\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 0,\r\n" + 
				"        \"rating_count\": 0,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"\",\r\n" + 
				"        \"addinfo_delivery\": \"\",\r\n" + 
				"        \"addinfo_fordisabled\": \"\",\r\n" + 
				"        \"addinfo_nursery\": \"\",\r\n" + 
				"        \"addinfo_package\": \"\",\r\n" + 
				"        \"addinfo_parking\": \"\",\r\n" + 
				"        \"addinfo_pet\": \"\",\r\n" + 
				"        \"addinfo_smokingroom\": \"\",\r\n" + 
				"        \"addinfo_wifi\": \"\",\r\n" + 
				"        \"meta_keywords_disp\": \"\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": 798371,\r\n" + 
				"                \"kid\": 1001100108103,\r\n" + 
				"                \"name\": \"주차장\",\r\n" + 
				"                \"rp_flag\": \"G\",\r\n" + 
				"                \"type\": \"PARKING\",\r\n" + 
				"                \"x\": 126.838295,\r\n" + 
				"                \"y\": 37.541363\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"confirmid\": \"1427272801\",\r\n" + 
				"        \"x\": 464282,\r\n" + 
				"        \"y\": 1122537,\r\n" + 
				"        \"name\": \"온유어마크\",\r\n" + 
				"        \"tel\": \"010-6655-8229\",\r\n" + 
				"        \"address\": \"서울 강서구 화곡동 1074-2 1층\",\r\n" + 
				"        \"reviewCount\": 1,\r\n" + 
				"        \"homepage\": \"http://www.instagram.com/jang_bbin_ddo\",\r\n" + 
				"        \"img\": \"\",\r\n" + 
				"        \"sourceId\": \"\",\r\n" + 
				"        \"source\": \"\",\r\n" + 
				"        \"grade_count\": \"0\",\r\n" + 
				"        \"roadview\": \"1119347210|8|0|||464278|1122511|0\",\r\n" + 
				"        \"full_category_ids\": \"9|86\",\r\n" + 
				"        \"last_cate_id\": \"86\",\r\n" + 
				"        \"last_cate_name\": \"카페\",\r\n" + 
				"        \"last_cate_depth\": \"2\",\r\n" + 
				"        \"cate_name_depth1\": \"음식점\",\r\n" + 
				"        \"cate_name_depth2\": \"카페\",\r\n" + 
				"        \"cate_name_depth3\": \"\",\r\n" + 
				"        \"cate_name_depth4\": \"\",\r\n" + 
				"        \"cate_name_depth5\": \"\",\r\n" + 
				"        \"storeview_id\": \"0\",\r\n" + 
				"        \"hub_data\": \"\",\r\n" + 
				"        \"brand\": \"\",\r\n" + 
				"        \"brandName\": \"카페\",\r\n" + 
				"        \"oil1\": \"0\",\r\n" + 
				"        \"oil2\": \"0\",\r\n" + 
				"        \"oil3\": \"0\",\r\n" + 
				"        \"oil4\": \"0\",\r\n" + 
				"        \"oilTime\": \"\",\r\n" + 
				"        \"oil_sel24\": \"\",\r\n" + 
				"        \"phoneSynonyms\": \"\",\r\n" + 
				"        \"related_place\": \"\",\r\n" + 
				"        \"new_address\": \"서울 강서구 화곡로26가길 32\",\r\n" + 
				"        \"courseinfo\": \"\",\r\n" + 
				"        \"geoinfo\": \"\",\r\n" + 
				"        \"requiringtime\": \"\",\r\n" + 
				"        \"tvshow_info\": \"\",\r\n" + 
				"        \"tvshow_name\": \"\",\r\n" + 
				"        \"address_disp\": \"서울|강서구|화곡동|1074-2|1층\",\r\n" + 
				"        \"new_address_disp\": \"서울|강서구||화곡로26가길|32|1층\",\r\n" + 
				"        \"distance\": \"\",\r\n" + 
				"        \"catetype\": \"C\",\r\n" + 
				"        \"new_zipcode\": \"07715\",\r\n" + 
				"        \"kplace_ratings_count\": \"0\",\r\n" + 
				"        \"kplace_rating\": \"0\",\r\n" + 
				"        \"openoff_status\": \"Y\",\r\n" + 
				"        \"shape_support_types\": \"\",\r\n" + 
				"        \"production_tags\": [],\r\n" + 
				"        \"rating_average\": 5,\r\n" + 
				"        \"rating_count\": 2,\r\n" + 
				"        \"accom_info\": \"\",\r\n" + 
				"        \"addinfo_appointment\": \"Y\",\r\n" + 
				"        \"addinfo_delivery\": \"N\",\r\n" + 
				"        \"addinfo_fordisabled\": \"Y\",\r\n" + 
				"        \"addinfo_nursery\": \"N\",\r\n" + 
				"        \"addinfo_package\": \"Y\",\r\n" + 
				"        \"addinfo_parking\": \"N\",\r\n" + 
				"        \"addinfo_pet\": \"N\",\r\n" + 
				"        \"addinfo_smokingroom\": \"N\",\r\n" + 
				"        \"addinfo_wifi\": \"Y\",\r\n" + 
				"        \"meta_keywords_disp\": \"데이트코스|소개팅\",\r\n" + 
				"        \"issue_keywords_disp\": \"\",\r\n" + 
				"        \"oil_carwash\": \"\",\r\n" + 
				"        \"oil_convenience\": \"\",\r\n" + 
				"        \"oil_maintenance\": \"\",\r\n" + 
				"        \"oil_self\": \"\",\r\n" + 
				"        \"mobility_parking_exit_type\": \"\",\r\n" + 
				"        \"zigbang_info\": null,\r\n" + 
				"        \"knavi_guide_infos\": []\r\n" + 
				"    }\r\n" + 
				"]"+"}";
		JSONObject jObject = new JSONObject(json1);
		
		JSONArray jArray = jObject.getJSONArray("posts");
		log.info(jArray.get(0));
		
		String [] cid = new String [14];
		for(int i =0; i< 14 ;i++) {
			JSONObject a = (JSONObject)jArray.get(i);
			
			cid[i] =a.get("confirmid").toString();
		}
		for(int i = 0; i < 14 ; i ++) {
			log.info(i+cid[i]);
		}
		
		
		return cid;
	}
	
	
}
