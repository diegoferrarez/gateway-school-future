package br.edu.gateway.school.future.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConvertableName {
    public static final String SEARCH_ALL_STUDENTS = "/v1/students/findAllStudents";
    public static final String CHANGE_FORM_STUDENT = "/v1/students/updateStudent/{id}";

    public ConvertableName() {
    }
}
