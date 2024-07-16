package com.example.apllication.utility;

import org.springframework.stereotype.Component;

@Component
public class BllingAccountNithesh implements CrediteMemo {


    public BllingAccountNithesh(){
        System.out.println("In Construcor"+getClass().getSimpleName());
    }


    @Override
    public String Billgenerator(){
        return "Nithesh Bill Generated";
    }


}
