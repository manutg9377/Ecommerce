//package com.example.apllication.exception;
//
//import com.example.apllication.OrderController;
//import com.example.apllication.entity.OmsOrdersDataResponse;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//
//
//@ControllerAdvice
//public class ExceptionHandler {
// @org.springframework.web.bind.annotation.ExceptionHandler
//    public ResponseEntity<OrderController> handlerExeption(OrderRefNotFoundException ex){
//
//        OmsOrdersDataResponse e1=new OmsOrdersDataResponse();
//        e1.setStatus(""+ HttpStatus.NOT_FOUND.value());
//        e1.setMessage(ex.getMessage());
//        e1.setDatetime(System.currentTimeMillis());
//        return new ResponseEntity(e1,HttpStatus.NOT_FOUND);
//    }
//
//    @org.springframework.web.bind.annotation.ExceptionHandler
//    public ResponseEntity<OrderController> handlerExeption(Exception ex){
//
//        OmsOrdersDataResponse e1=new OmsOrdersDataResponse();
//        e1.setStatus(""+ HttpStatus.BAD_REQUEST.value());
//        e1.setMessage(ex.getMessage());
//        e1.setDatetime(System.currentTimeMillis());
//        return new ResponseEntity(e1,HttpStatus.BAD_REQUEST);
//    }
//}
