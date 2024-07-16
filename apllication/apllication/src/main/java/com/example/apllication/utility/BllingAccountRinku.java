package com.example.apllication.utility;

public class BllingAccountRinku implements CrediteMemo{

    public BllingAccountRinku(){
        System.out.println("In Constructor"+getClass().getSimpleName());
    }

    @Override
    public String Billgenerator() {
        return  "Bill Acocunt Rinku";
    }
}
