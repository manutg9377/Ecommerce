package com.example.apllication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OmsOrderFulfillment {

    @Id
    @SequenceGenerator(name="OrderFulfillment_Sequence",
            sequenceName = "OrderFulfillment_Sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "OrderFulfillment_Sequence")

    @Column(name = "fulfillmentId")
    private Integer fulfillmentId;

    @Column(name = "fulfillmentRef")
    private String fulfilmentRef;

    @Column(name = "fulfillmentItems")
    private List<String> fulfillmentItems;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId",referencedColumnName = "orderId")
    private OmsOrdersData omsOrdersData;

    @ManyToMany
    @JoinTable(
            name = "ORDER_RETURN_FULFILMENT",
            joinColumns = @JoinColumn(
                    name = "fulfillmentId",
                    referencedColumnName = "fulfillmentId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "returnFulfillmentId",
                    referencedColumnName = "returnFulfillmentId"
            )
    )
    private List<ReturnDataFulfilment> returnDataFulfilments;


//    public void addFulfilment(ReturnDataFulfilment  returnDataFulfilment){
//        if(returnDataFulfilment == null) returnDataFulfilment = new ArrayList<>();
//        returnDataFulfilments.add(returnDataFulfilment);
//    }
}
