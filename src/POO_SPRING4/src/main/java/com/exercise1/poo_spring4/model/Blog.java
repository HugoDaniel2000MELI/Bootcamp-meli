package com.exercise1.poo_spring4.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    int id;
    String title;
    String authorName;
    String publishingDate;
}
