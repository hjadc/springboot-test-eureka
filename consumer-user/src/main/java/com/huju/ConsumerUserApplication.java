package com.huju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者,勾选第一个(Eureka Discovery 里的 Eureka Discovery)
 * 现在它自己也是服务提供方
 * @EnableDiscoveryClient 开启发现服务的功能
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerUserApplication.class, args);
	}

	/**
	 * 注册RestTemplate
	 * @return
	 */
	@LoadBalanced // 可以使用负载均衡机制
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
