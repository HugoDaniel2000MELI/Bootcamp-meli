package com.exercise1.poo_spring4.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExcepitionsDetails {
    private String title;
    private int status;
    private String message;
    private LocalDateTime timeStamp;

}
