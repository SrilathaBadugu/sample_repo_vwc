package com.sb.EmpController;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.EmpService.EmpService;
@RestController
@Component
public class EmpController {
	
		private static final Logger logger = LoggerFactory.getLogger(EmpService.class);
	    @Autowired
	    EmpService s;
	    
		@RequestMapping("/v1")
		public String Show() {
		logger.info("This is First Method");
			return "Hello";
		}

		@RequestMapping("/v2")
		public String print() {
		logger.info("This is Second Method");
			return "Hello Vilage World Class";
		}
	/*RQ_1361-code changes - start*/	
		@Getmapping("/v3")
		/*RQ_1361-code changes - End*/
		public ArrayList load() {
        logger.info("This is Third Method");
			return s.m1();
		}
		
		}


		
	


