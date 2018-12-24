package org.eureka.feign.web.controller;

import org.eureka.feign.interfaces.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "Feign: sorry " + name;
	}

}
