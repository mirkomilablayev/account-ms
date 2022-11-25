package com.example.accountservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    @Column(nullable = false)
    private Long customerId;
    @Column(nullable = false)
    private String accountType;
    @Column(nullable = false)
    private String branchAddress;
    private LocalDate createdAt = LocalDate.now();
}
