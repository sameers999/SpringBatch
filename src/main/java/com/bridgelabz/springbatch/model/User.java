package com.bridgelabz.springbatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public @Data class User {
    @Id
    private int userId;
    private String firstName;
    private String lastName;
}
