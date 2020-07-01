package br.com.pedrozelinski.reportApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiStarter {
	
	public static ConfigurableApplicationContext  ctx;
	
	public static void main(String[] args){
		ctx = SpringApplication.run(ApiStarter.class, args);
	}
	public static void closeApi () {
		ctx.close();
	}

}
