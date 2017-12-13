import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/config/spring-*.xml");
        context.start();
        System.out.println("zywork-ucenter started...");
        System.in.read();
    }

}
