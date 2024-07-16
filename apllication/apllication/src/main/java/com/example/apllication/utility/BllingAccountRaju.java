package com.example.apllication.utility;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BllingAccountRaju implements CrediteMemo {
    public BllingAccountRaju(){
        System.out.println("In Construcor"+getClass().getSimpleName());
    }


    @Override
    public String Billgenerator(){
        return "Raju Bill Generated";
    }


}
