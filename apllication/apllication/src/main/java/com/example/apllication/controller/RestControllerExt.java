package com.example.apllication.controller;

import com.example.apllication.utility.CrediteMemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExt {
    @Value("${Order}")
    private String orderRef;

    @Value("${Fulfilment}")
    private String FulfilmentRef;

    private CrediteMemo creditmemoAus;

    private CrediteMemo creditmemoSG;

    @Autowired
    public RestControllerExt(@Qualifier("BllingAccountRinku") CrediteMemo c,
                             @Qualifier("bllingAccountRaju") CrediteMemo c1) {
        System.out.println("In Constructor"+getClass().getSimpleName());
        creditmemoAus = c;
        creditmemoSG= c1;
    }


//    public void setMessage(CrediteMemo c){
//        creditmemo = c;
//    }

    @GetMapping("/Order")
    public String Order(){
        return  orderRef;
    }

    @GetMapping("/Fulfilment")
    public String Fulfilment(){
        return  FulfilmentRef;
    }

    @GetMapping("/BillDisplay")
    public String Bill(){
        return creditmemoAus.Billgenerator();
    }

    @GetMapping("/CreditMemoDispaly")
    public String Creditmemo(){
        return  "comparing beans"+(creditmemoAus==creditmemoSG);
    }
}
