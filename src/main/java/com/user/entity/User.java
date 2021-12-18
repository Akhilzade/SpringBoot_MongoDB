package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private long id;
    private String name;
    private int age;
    private double salary;
}
