package start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;




import com.jinglun.util.InitListener;

@ServletComponentScan
@ComponentScan("com.jinglun.controller,com.jinglun.biz,com.jinglun.util")//扫描biz，controller组件
@MapperScan("com.jinglun.dao")    //扫描mapper组件
@EnableAutoConfiguration
public class StartApp extends SpringBootServletInitializer {
	@Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(StartApp.class);  
    }
public static void main(String[] args) {
	SpringApplication springApplication = new SpringApplication(StartApp.class);
	springApplication.addListeners(new InitListener());
	springApplication.run(args);
	
}
}
