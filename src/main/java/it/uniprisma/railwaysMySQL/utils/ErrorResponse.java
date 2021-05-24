package it.uniprisma.railwaysMySQL.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private String exceptionName;
    private String message;
    private String position;

}
