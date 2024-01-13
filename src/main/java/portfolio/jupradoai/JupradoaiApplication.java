package portfolio.jupradoai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Import; // Importe esta classe

import portfolio.jupradoai.Configuration.CorsConfig;

@Import(CorsConfig.class) // Importe a classe CorsConfig
@SpringBootApplication
@ComponentScan(basePackages = "portfolio.jupradoai")
public class JupradoaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JupradoaiApplication.class, args);
	}

}
