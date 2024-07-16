package com.example.apllication.dao;

import com.example.apllication.entity.CrediteMemoData;
import com.example.apllication.entity.ReturnData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
public class CrediteMemoRepositoryTest {


    @Autowired
    public CrediteMemoRepository crediteMemoRepository;



    @Test
    public void findallData(){
        List<CrediteMemoData> l1= crediteMemoRepository.findAll();
        System.out.println(l1);
    }

}