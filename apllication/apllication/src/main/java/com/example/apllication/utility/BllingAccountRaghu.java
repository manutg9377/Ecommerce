package com.example.apllication.utility;

import org.springframework.stereotype.Component;

@Component
public class BllingAccountRaghu implements CrediteMemo {

    public BllingAccountRaghu(){
        System.out.println("In Construcor"+getClass().getSimpleName());
    }

    @Override
    public String Billgenerator(){
        return "Raghu Bill Generated";
    }


}
