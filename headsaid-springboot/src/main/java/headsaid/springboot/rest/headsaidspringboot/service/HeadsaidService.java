package headsaid.springboot.rest.headsaidspringboot.service;

import org.springframework.stereotype.Component;

import headsaid.springboot.rest.headsaidspringboot.HeadsaidModel;

@Component
public class HeadsaidService
{
	
	public HeadsaidModel getHeadsaid()
	{
		return new HeadsaidModel("Ahmed","Mahmoud","123");
	}

}
