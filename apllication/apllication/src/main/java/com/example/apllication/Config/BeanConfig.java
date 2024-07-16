package com.example.apllication.Config;

import com.example.apllication.utility.BllingAccountRinku;
import com.example.apllication.utility.CrediteMemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("BllingAccountRinku")
    public CrediteMemo BllingAccount(){
        return new BllingAccountRinku();
    }

}
