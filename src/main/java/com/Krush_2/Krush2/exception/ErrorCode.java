package com.Krush_2.Krush2.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

  // global
  INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버에 문제가 발생했습니다."),
  INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),

  // member
  DUPLICATION_LOGIN_ID(HttpStatus.BAD_REQUEST, "이미 존재하는 아이디 입니다.");

  private final HttpStatus status;
  private final String message;
}