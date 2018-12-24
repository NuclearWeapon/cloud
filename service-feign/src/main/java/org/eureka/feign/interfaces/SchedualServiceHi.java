package org.eureka.feign.interfaces;

import org.eureka.feign.web.controller.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "service-hi")
// |  add
// |  hystrix
// V
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
