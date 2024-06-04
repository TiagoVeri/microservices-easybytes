package com.eazybytes.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    private Long customerId;
    @Id
    private Long accountNumber; //for auto-incrementing this one we have a special logic as this doesn't work as regular ID but more as a serial number
    private String accountType;
    private String branchAddress;
}
