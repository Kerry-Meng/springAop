package springAOP;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtron.springAOP.aops.Init;
import com.softtron.springAOP.services.UserService;

public class SpringAOPTest {
	
	@Test
	public void test() {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
//		UserService userService = (UserService) context.getBean("userservice");
//		userService.login();
//		System.out.println(userService.getToken());
		
		AnnotationConfigApplicationContext aContext = new AnnotationConfigApplicationContext();
		aContext.register(Init.class);
		aContext.refresh();
		UserService userService = (UserService) aContext.getBean("userservice");
//		userService.login();
//		userService.register();
		userService.getToken();
	}
	
}
