package com.example.apllication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReturnDataFulfilment {

    @Id
    @SequenceGenerator(name="ReturnDataFulfilment_Sequence",
            sequenceName = "ReturnDataFulfilment_Sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ReturnDataFulfilment_Sequence")
    private Integer returnFulfillmentId;

    private  List<String> returnFulfillmentRef;

    private  List<String> returnFulfillmentItems;




}
