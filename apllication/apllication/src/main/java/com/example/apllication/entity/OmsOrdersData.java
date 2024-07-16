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
@AttributeOverrides({
        @AttributeOverride(
                name="id",
                column = @Column(name = "id")
        ),
        @AttributeOverride(
                name="country",
                column = @Column(name = "country")
        ),
        @AttributeOverride(
                name="orderRefs",
                column = @Column(name = "orderRefs")
        )

})
public class OmsOrdersData {
    @Id
    @SequenceGenerator(name="Order_Sequence",
            sequenceName = "Order_Sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Order_Sequence")


    private  Integer orderId;
    private String country;

    private List<Integer> orderRefs;

}
