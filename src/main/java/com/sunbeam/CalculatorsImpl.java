package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorsImpl {
	@Autowired
	private CalService calservice;
	
	public CalculatorsImpl() {
	System.out.println("CalculatorsImpl() ctor is called"+getClass().getName());
	}
	
	@GetMapping("/calr")
	public String getCals(Model map)
	{
		System.out.println("getCal here"+getClass().getName());
		
		Calculator c = new Calculator();
		
		map.addAttribute("c", c);
		
		return "/calculator";
		
	}
	
	@PostMapping("/calr")
	public String processCals(Calculator c,Model map)
	{
		System.out.println("processCals called here"+getClass().getName());
		
		 int result = calservice.calculate(c.getNum1(), c.getNum2(), c.getOperation());
		    c.setResult(String.valueOf(result));
		    
		    map.addAttribute("c", c);
		    
		    return "/calculator";
		
	}

}
