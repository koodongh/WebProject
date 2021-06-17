package com.multi.shampoorang.ocr
;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/fileupload/**")
    	.addResourceLocations("file:/usr/local/tomcat9/webapps/ROOT/WEB-INF/classes/static/fileupload/"); 
    }
}


