package com.example.apllication.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "crediteMemoData")


public class ReturnData {
    @Id
    @SequenceGenerator(name="returnData_Sequence",
            sequenceName = "returnData_Sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "returnData_Sequence")

    @Column(name = "returnOrderId")
    private Integer returnOrderId;

    @Column(name = "returnOrderRef")
    private String returnOrderRef;

    @Column(name = "returnItems")
    private List<String> returnItems;

    @OneToOne(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY,
    optional = false)
    @JoinColumn(name = "creditMemoId",referencedColumnName = "creditMemoId")
    private CrediteMemoData crediteMemoData;

    @OneToMany(cascade =  CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "returnOrderId",referencedColumnName = "returnOrderId")
    private List<ReturnDataFulfilment> returnDataFulfilment;
}
