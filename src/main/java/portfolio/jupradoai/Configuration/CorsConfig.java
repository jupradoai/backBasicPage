package portfolio.jupradoai.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("https://86c42919-63fd-4d5c-975c-e06e43042b18-00-2vlox1low0mkr.worf.replit.dev/"); // Substitua pelo domínio do seu frontend
    }
}

