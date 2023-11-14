package br.edu.gateway.school.future.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConvertableName {
    public static final String URI_KEY = "http://localhost:8080/";
    public static final String BASE_URL = "/v1/students/";
    public static final String SEARCH_ALL_STUDENTS = BASE_URL + "findAllStudents";
    public static final String SEARCH_BY_REGISTRATION_NUMBER = BASE_URL + "findByRegistration/{registrationNumber}";
    public static final String CREATE_REGISTRATION_STUDENT = BASE_URL + "registerStudents";
    public static final String CHANGE_FORM_STUDENT = BASE_URL + "updateStudent/{registrationNumber}";
    public static final String CHANGE_STATUS_STUDENTS = BASE_URL + "changeStatusStudent/{registrationNumber}";



    public ConvertableName() {
    }
}
