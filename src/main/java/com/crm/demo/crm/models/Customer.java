package com.crm.demo.crm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

//    Hibernate описание таблицы с помощью класса и генерация бд

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCustomer;
    @Column
    private String companyTitle;
}
