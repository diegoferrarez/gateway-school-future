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
                        .uri(ConvertableName.URI_KEY))
                .route("searchByRegistrationNumber", route -> route
                        .path(ConvertableName.SEARCH_BY_REGISTRATION_NUMBER)
                        .uri(ConvertableName.URI_KEY))
                .route("createdRegisterStudent", route -> route
                        .path(ConvertableName.CREATE_REGISTRATION_STUDENT)
                        .uri(ConvertableName.URI_KEY))
                .route("changeInfoStudent", route -> route
                        .path(ConvertableName.CHANGE_FORM_STUDENT)
                        .uri(ConvertableName.URI_KEY))
                .route("changeStatusStudents", route -> route
                        .path(ConvertableName.CHANGE_STATUS_STUDENTS)
                        .uri(ConvertableName.URI_KEY))
                .build();
    }
}
