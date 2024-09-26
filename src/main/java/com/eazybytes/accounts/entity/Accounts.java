package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table()
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {


    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Id
    private Long accountNumber ;
    private String accountType;
    private String branchAddress;
}
