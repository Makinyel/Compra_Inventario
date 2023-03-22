package com.example.compra.share;

import org.springframework.http.HttpStatus;

public class CompraNotFoundException extends BaseException {


    public CompraNotFoundException(String massage) {
        super(false, HttpStatus.NOT_FOUND,massage,ExceptionCode.COMPRA_NOT_FOUND);
    }
}
