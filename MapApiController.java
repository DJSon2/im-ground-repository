package com.iamground.iam.member.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

	@RestController
	@RequestMapping("/api")
	public class MapApiController {
	
	  @Autowired
	  private JdbcTemplate jdbcTemplate;
	
	  
	  // 마커 url에 쿼리 액세스
	  @GetMapping("/mapCenter")
	  public List<Map<String, Object>> getCenterMarkerInfo() {
		  
	    String sql =  "SELECT COMPANY_NAME, COMPANY_ADDRESS_LATITUDE, COMPANY_ADDRESS_LONGITUDE, COMPANY_ADDRESS, COMPANY_TIME, COMPANY_PHONE FROM TBL_PROMEMBER WHERE COMPANY_ADDRESS LIKE '%종로%'";
	    
	    List<Map<String, Object>> data = jdbcTemplate.queryForList(sql);

	    return data;
	  }
	  

	  // 마커 url에 쿼리 액세스
	  @GetMapping("/mapWest")
	  public List<Map<String, Object>> getWestMarkerInfo() {
	    String sql =  "SELECT COMPANY_NAME, COMPANY_ADDRESS_LATITUDE, COMPANY_ADDRESS_LONGITUDE, COMPANY_ADDRESS, COMPANY_TIME, COMPANY_PHONE FROM TBL_PROMEMBER WHERE COMPANY_ADDRESS LIKE '%서%'";
	    
	    List<Map<String, Object>> data = jdbcTemplate.queryForList(sql);
		
	    return data;
	  }
	  
	  @GetMapping("/mapEast")
	  public List<Map<String, Object>> getEastMarkerInfo() {
		  
	    String sql =  "SELECT COMPANY_NAME, COMPANY_ADDRESS_LATITUDE, COMPANY_ADDRESS_LONGITUDE, COMPANY_ADDRESS, COMPANY_TIME, COMPANY_PHONE FROM TBL_PROMEMBER WHERE COMPANY_ADDRESS LIKE '강동%'";
	     
	    List<Map<String, Object>> data = jdbcTemplate.queryForList(sql);
	    
	    return data;
	  }
	  
	  @GetMapping("/mapSouth")
	  public List<Map<String, Object>> getSouthMarkerInfo() {
		  
	    String sql =  "SELECT COMPANY_NAME, COMPANY_ADDRESS_LATITUDE, COMPANY_ADDRESS_LONGITUDE, COMPANY_ADDRESS, COMPANY_TIME, COMPANY_PHONE FROM TBL_PROMEMBER WHERE COMPANY_ADDRESS LIKE '%남%'";
	    
	    List<Map<String, Object>> data = jdbcTemplate.queryForList(sql);
	   
	    return data;
	  }
	  
	  @GetMapping("/mapNorth")
	  public List<Map<String, Object>> getNorthMarkerInfo() {
		  
	    String sql =  "SELECT COMPANY_NAME, COMPANY_ADDRESS_LATITUDE, COMPANY_ADDRESS_LONGITUDE, COMPANY_ADDRESS, COMPANY_TIME, COMPANY_PHONE FROM TBL_PROMEMBER WHERE COMPANY_ADDRESS LIKE '%북%'";
	    
	    List<Map<String, Object>> data = jdbcTemplate.queryForList(sql);
	   
		
	    return data;
	  }
}

