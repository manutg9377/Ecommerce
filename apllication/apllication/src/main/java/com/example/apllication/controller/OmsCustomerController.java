package com.example.apllication.controller;

import com.example.apllication.dao.OmsCustomer;
import com.example.apllication.entity.OmsCustomerData;

public class OmsCustomerController {

    private OmsCustomer omsCustomer;

    public OmsCustomerController(OmsCustomer omsCustomer) {
        this.omsCustomer = omsCustomer;
    }

//    @GetMapping("/Customers")
//    public List<OmsCustomerData> findAll(){
//        return omsCustomer.findall();
//    }

}
