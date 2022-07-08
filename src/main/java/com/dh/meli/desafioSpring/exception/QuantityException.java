package com.dh.meli.desafioSpring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE)
public class QuantityException extends RuntimeException {
        public QuantityException() {
            super();
        }
 }
