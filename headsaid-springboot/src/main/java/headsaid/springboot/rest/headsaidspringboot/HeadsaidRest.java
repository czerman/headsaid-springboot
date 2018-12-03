package headsaid.springboot.rest.headsaidspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import headsaid.springboot.rest.headsaidspringboot.service.HeadsaidService;

@RestController
public class HeadsaidRest 
{
	@Autowired
	private HeadsaidService service;
	
	@RequestMapping(name = "/HeadsaidRest",produces= "application/json")

	public HeadsaidModel getHeadsaid()
	{
		return service.getHeadsaid();
		}

	
 

}
