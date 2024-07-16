package com.example.apllication.entity;

import com.example.apllication.dao.OmsOrderFulfillmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class OmsOrderFulfillmentTest {

    @Autowired
    private OmsOrderFulfillmentRepository omsOrderFulfillmentRepository;

    @Test
    public void saveOmsOrderFuldilmentData(){

        OmsOrdersData o1=new OmsOrdersData().builder()
                .country("AU")
                .orderRefs(Arrays.asList(123,456,789))
                .build();

        OmsOrderFulfillment o2=new OmsOrderFulfillment().builder()
                .fulfilmentRef("1234")
                .fulfillmentItems(Arrays.asList("123","345","674"))
                .omsOrdersData(o1)
                .build();

        omsOrderFulfillmentRepository.save(o2);

    }
}