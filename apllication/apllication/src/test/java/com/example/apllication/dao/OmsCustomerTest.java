package com.example.apllication.dao;

import com.example.apllication.entity.CustomerDataExtend;
import com.example.apllication.entity.OmsCustomerData;
import com.example.apllication.entity.OmsOrdersData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
public class OmsCustomerTest {
    @Autowired
    private OmsCustomer omsCustomer;

    @Test
    public void saveOmsCustomerData() {

         CustomerDataExtend o2 = CustomerDataExtend.builder()
                .country("MY") // Ensure the method name match
                .build();

        OmsCustomerData o1 = OmsCustomerData.builder()
                .firstName("RAN")
                .lastName("TA")
                .PhNO("9883283123333")
                .email("test4@gmail.com")
                .customerDataExtend(o2)
                .build();
        omsCustomer.save(o1);
    }
@Test
    public void findByOmsCustomerEmail(){
        List<OmsCustomerData> l1=omsCustomer.findByemail("test1@gmail.com");
        System.out.println(l1);
    }

    @Test
    public void findByOmsCustomerEmailContaining(){
        List<OmsCustomerData> l1=omsCustomer.findByemailContaining("test4");
        System.out.println(l1);
    }

    @Test
    public void findByOmsCustomerCountry(){
        List<OmsCustomerData> customers = omsCustomer.findByCustomerDataExtendCountry("MY");
        System.out.println(customers);
    }

    @Test
    public void findByOmsCustomerFnLn(){
        List<OmsCustomerData> l1=omsCustomer.findByFirstNameAndLastName("RAN","TA");
        System.out.println(l1);
    }

   @Test
    public void printGetEmailAddress(){
       OmsCustomerData o1=  omsCustomer.getEmailAddress("test1@gmail.com");
       System.out.println(o1);
   }

    @Test
    public void printGetFirstNameEmailAddress(){
        String o1=  omsCustomer.getFirstNameEmailAddress("test@gmail.com");
        System.out.println(o1);
    }

    @Test
    public void printGetFirstNameEmailAddressNative(){
        OmsCustomerData o1=  omsCustomer.getFirstNameEmailAddressNative("test1@gmail.com");
        System.out.println(o1);
    }

    @Test
    public void printGetFirstNameEmailAddressNativeParam(){
        OmsCustomerData o1=  omsCustomer.getFirstNameEmailAddressNativeParam("test1@gmail.com");
        System.out.println(o1);
    }

    @Test
    public void printGetFirstNameEmailAddressTransactional(){
        int o1=  omsCustomer.getFirstNameEmailAddressTransactional("test0@gmail.com",1);
        System.out.println(o1);
    }





}