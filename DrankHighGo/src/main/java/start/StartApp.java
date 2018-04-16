package start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
@ServletComponentScan("poolConfig")  //扫描1
@ComponentScan("com.jinglun.controller,com.jinglun.biz")//扫描biz，controller组件
@MapperScan("com.jinglun.dao")    //扫描mapper组件
@EnableAutoConfiguration
public class StartApp {
public static void main(String[] args) {
	SpringApplication.run(StartApp.class, args);
}
}
