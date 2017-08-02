package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
 @Controller
 public class Test {
	private static Logger logger = LoggerFactory.getLogger(Test.class);
	
	@Value("${girl.cupSize}")
	private String cup;
	
	@Value("${girl.name}")
	private String name;
	
	/*@Value("${age}")
	private Integer age;
	
	@Value("${sex}")
	private String sex;
	
	@Value("${context}")
	private String context;*/
	

	/*@Autowired
	private Girl girl;*/
	
	
     @RequestMapping(value={"/hello","hell"},method=RequestMethod.POST)	
     @ResponseBody
     String index() {
         return "Hello World"+"   CupSize:"+cup;
     }	
 
     public static void main(String[] args) {
         SpringApplication.run(Test.class, args);
         logger.info("启动了!!!!");
     }
 }