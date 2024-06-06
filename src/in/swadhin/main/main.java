package in.swadhin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.swdhin.springdemo1;

public class main {

	public static void main(String[] args) {
		String location="/in/swadhin/appconfigure/web.xml";
	ApplicationContext ac=new ClassPathXmlApplicationContext(location);
	springdemo1 sd=(springdemo1)ac.getBean("servletdemo");
	sd.display();
	System.out.println("-----------------");
	springdemo1 sd1=(springdemo1)ac.getBean("servletdemo1");
	sd1.display();
	}

}
