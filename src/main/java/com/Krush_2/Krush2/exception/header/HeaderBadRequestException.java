package com.Krush_2.Krush2.exception.header;

import com.Krush_2.Krush2.response.status.BaseSatus;
import lombok.Getter;

@Getter
public class HeaderBadRequestException extends RuntimeException {

    private final BaseSatus errorCode;

    public HeaderBadRequestException(BaseSatus errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}