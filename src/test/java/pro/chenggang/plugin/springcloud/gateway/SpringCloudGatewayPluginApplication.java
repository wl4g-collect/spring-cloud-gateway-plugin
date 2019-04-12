package pro.chenggang.plugin.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.chenggang.plugin.springcloud.gateway.annotation.EnableGatewayPlugin;

@SpringBootApplication
@EnableGatewayPlugin
public class SpringCloudGatewayPluginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayPluginApplication.class, args);
	}

}

