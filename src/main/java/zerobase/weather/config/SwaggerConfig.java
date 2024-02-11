package zerobase.weather.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;
@OpenAPIDefinition(
        info = @Info(title = "날씨 일기 프로젝트",
        description = "날씨를 가져와서 일기를 쓸 수있습니다 ",
        version = "1.0")
)
@Configuration
public class SwaggerConfig{


}