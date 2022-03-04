package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String firstName;
    private String lastName;
}
