package qa.com.Spring.controller;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	
	
	@RequestMapping("/msg")
	public String msg() {
		return "hello";
	}
	
	@RequestMapping(value = "/msg2", method = RequestMethod.POST)
	public String msg2() {
		return "hello, this is Post";
	}

	@RequestMapping(value = "/msg3", method = RequestMethod.GET)
	public String msg3() {
		return "hello, this is Get";
	}
	@RequestMapping(value = "/msg4")
	public String msg4() {
		return "hello, this is the rest";
	}
	@RequestMapping(value = "/msg5/{one}/{operator}/{two}")
	public int msg5 (@PathVariable("one") int one,
			@PathVariable("two") int two,
			@PathVariable("operator") String operator){
		
		if(operator.equals("+")) {
			return one+two;	
		}else if (operator.equals("-")) {
				return one-two;	
			
		}else if (operator.equals("*")) {
			return 
					one*two;	
		}else if (operator.equals("divide")) {
			return one/two;	
		}else return 0;
		
	}
		
	@RequestMapping(value = "/info2")
	public String processRequest(String name, String city)
	{
		return name + city;
	}
	
//	@RequestMapping(value="/what", method= {RequestMethod.POST,RequestMethod.GET})
//	public String what()
//	{
//		
//		ArrayList<String> numberline = new ArrayList<String>(
//			    Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
//		
//		String[] TeensNumberline = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//		{"twenty", "thirty", "fourty", "Fifty","sixty", "seventy", "eighty", "ninty"};
//		
//		
//		
//		1.734
//		
//		return "hihi";
//	}
	}
//	@RequestMapping(value = "/msg5/(name)/(lastname)")
//	public String msg5 @PathVariable("name", String name)
//	public String msg5 @PathVariable("lastname", String lastname){
//		return name + lastname;
//	}


