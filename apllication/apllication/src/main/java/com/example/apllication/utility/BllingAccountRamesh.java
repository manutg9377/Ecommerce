package com.example.apllication.utility;

import org.springframework.stereotype.Component;

@Component
public class BllingAccountRamesh implements CrediteMemo {
    public BllingAccountRamesh(){
        System.out.println("In Construcor"+getClass().getSimpleName());
    }

    @Override
    public String Billgenerator(){
        return "Ramesh Bill Generated";
    }
}
