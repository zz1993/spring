package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {
	
	@RequestMapping(value="/zz",method=RequestMethod.GET)
	public String say(){
		
		return "HELLO WORD!";
	}

}
