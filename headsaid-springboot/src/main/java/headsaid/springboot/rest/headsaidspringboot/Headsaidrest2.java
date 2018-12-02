package headsaid.springboot.rest.headsaidspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import headsaid.springboot.rest.headsaidspringboot.service.HeadsaidService;

@RestController
public class Headsaidrest2 {
	
	@Autowired
	private HeadsaidService service;
	
	@RequestMapping("/HeadsaidRest2")
	public String getHeadsaid()
	{
		return service.getHeadsaid()+"2";
		}

}


