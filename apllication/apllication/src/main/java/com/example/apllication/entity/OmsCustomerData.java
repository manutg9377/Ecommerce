package com.example.apllication.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="oms_customer_data",
        uniqueConstraints = @UniqueConstraint(name = "emailId_unique",
                columnNames = "emailAddress")
)
public class OmsCustomerData {

    @Id
    @SequenceGenerator(name="omsCustomerData_Sequence",
            sequenceName = "omsCustomerData_Sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "omsCustomerData_Sequence")
    @Column(name = "id")
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "emailAddress",nullable = false)
    private String email;

    @Column(name = "PhoneNumber")
    private String PhNO;

    @Embedded
    private CustomerDataExtend customerDataExtend;




}
