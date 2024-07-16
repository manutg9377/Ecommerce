package com.example.apllication.dao;

import com.example.apllication.entity.CrediteMemoData;
import com.example.apllication.entity.ReturnData;
import com.example.apllication.entity.ReturnDataFulfilment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
public class ReturnDataRepositoryTest {

    @Autowired
    public ReturnDataRepository returnDataRepository;

    @Test
    public void saveReturnsData(){

        CrediteMemoData c=CrediteMemoData.builder()
                .creditMemoRef("1CD")
                .creditMemoItems(Arrays.asList("1CDD","2CDD"))
                .build();

        ReturnDataFulfilment r1=ReturnDataFulfilment.builder()
                .returnFulfillmentItems(Arrays.asList("1RI2D","2RI45D"))
                .returnFulfillmentRef(Arrays.asList("1RF2D","2RF45D"))
                .build();

        ReturnDataFulfilment r2=ReturnDataFulfilment.builder()
                .returnFulfillmentItems(Arrays.asList("3RI2D","4RI4D"))
                .returnFulfillmentRef(Arrays.asList("3RF2D","4RF45D"))
                .build();

        ReturnData r=ReturnData.builder()
                .returnOrderRef("1RD")
                .returnItems(Arrays.asList("1RBD","2RBD"))
                .crediteMemoData(c)
                .returnDataFulfilment(List.of(r1,r2))
                .build();

        returnDataRepository.save(r);

    }

    @Test
    public void findallData(){
        List<ReturnData> l1= returnDataRepository.findAll();
        System.out.println(l1);
    }

    @Test
    public void findAllPagination(){
        Pageable firstPageWithThreeRecords= PageRequest.of(0,3);
        Pageable firstPageWithTwoRecords= PageRequest.of(1,3);

        List<ReturnData> data = returnDataRepository.findAll(firstPageWithTwoRecords).getContent();

        long totalElements=returnDataRepository.findAll(firstPageWithTwoRecords).getTotalElements();

        long totalPages=returnDataRepository.findAll(firstPageWithTwoRecords).getTotalPages();

        System.out.println("Data"+data);

        System.out.println("totalElements"+totalElements);

        System.out.println("totalPages"+totalPages);
    }

}