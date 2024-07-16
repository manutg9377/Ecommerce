package com.example.apllication.dao;

import com.example.apllication.entity.ReturnData;
import com.example.apllication.entity.ReturnDataFulfilment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
public class ReturnDataFulfilmentRepositoryTest {

    @Autowired
    private ReturnDataFulfilmentRepository returnDataFulfilmentRepository;

//    @Test
//    public void saveReturnsData(){
//
//        ReturnDataFulfilment r1=ReturnDataFulfilment.builder()
//                .returnFulfillmentItems(Arrays.asList("1RI2","2RI45"))
//                .returnFulfillmentRef(Arrays.asList("1RF2","2RF45"))
//                .build();
//
//        ReturnDataFulfilment r2=ReturnDataFulfilment.builder()
//                .returnFulfillmentItems(Arrays.asList("3RI2","4RI45"))
//                .returnFulfillmentRef(Arrays.asList("3RF2","4RF45"))
//                .build();
//
//        ReturnData rd1=ReturnData.builder()
//                .returnOrderRef("R1")
//                .returnItems(Arrays.asList("12","33"))
//                .returnDataFulfilment(List.of(r1,r2))
//                .build();
//
//        returnDataFulfilmentRepository.save(r1);
//    }
}