package com.wzj.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//在主类汇总通过加上@EnableDiscoveryClient注解，
// 激活Eureka中的DiscoveryClient实现
// （自动化配置，创建DiscoveryClient接口针对Eureka客户端的EnableDiscoveryClient实例），
// 才能实现上述Controller中对服务信息的输出。
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
}
