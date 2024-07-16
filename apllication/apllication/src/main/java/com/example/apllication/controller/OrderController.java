package com.example.apllication;

import com.example.apllication.entity.OmsOrdersData;
import com.example.apllication.entity.OmsOrdersDataResponse;
import com.example.apllication.exception.OrderRefNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

  private List<OmsOrdersData> orderData;
    @PostConstruct
    public void loadData() {
        orderData = new ArrayList<>();
//        orderData.add(new OmsOrdersData("TH",  Arrays.asList(123,234)));
//        orderData.add(new OmsOrdersData("MY", Arrays.asList(123,234)));
//        orderData.add(new OmsOrdersData("SG", Arrays.asList(123,234)));
//        orderData.add(new OmsOrdersData("AU", Arrays.asList(123,234)));
    }

    @GetMapping("/orders")
    public List<OmsOrdersData> OrdeRef(){
  return orderData;
    }

    @GetMapping("/orders/{orderNo}")
    public OmsOrdersData getOmsOrdersData(@PathVariable int orderNo){
       if(orderNo>orderData.size()|| (orderNo<0)){
           throw new OrderRefNotFoundException("exception in orderef- "+orderNo);
       }


        return orderData.get(orderNo);
    }


}
