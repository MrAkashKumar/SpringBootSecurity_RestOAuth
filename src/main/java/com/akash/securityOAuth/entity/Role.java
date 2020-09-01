package com.akash.securityOAuth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Role {

    @Id
    @GeneratedValue()
    private Long id;

    private String name;



}
