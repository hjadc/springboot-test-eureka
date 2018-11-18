package com.huju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心勾选第二个(Eureka Service)
 * 1.在yml里配置Eureka信息
 * 2.启用注册中心@EnableEurekaServer
 *
 * 启动后可以访问http://localhost:8761/查看eureka的首页
 * 页面里Instances currently registered with Eureka 里是所有注册的服务
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
