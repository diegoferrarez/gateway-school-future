package br.edu.gateway.school.future.config;

import br.edu.gateway.school.future.util.ConvertableName;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsRouteConfig {

    @Bean
    public RouteLocator customRoute(RouteLocatorBuilder builder){
        return builder.routes()
                .route("searchAllStudent", route -> route
                        .path(ConvertableName.SEARCH_ALL_STUDENTS)
                        .uri("http://localhost:8080/"))
                .route("changeInfoStudent", route -> route
                        .path(ConvertableName.CHANGE_FORM_STUDENT)
                        .uri("http://localhost:8080/"))
                .build();
    }
}
