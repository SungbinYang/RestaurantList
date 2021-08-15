package me.sungbin.restaurant.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    String statusCode;

    String requestUrl;

    String code;

    String message;

    String resultCode;

    List<Error> errorList;
}
