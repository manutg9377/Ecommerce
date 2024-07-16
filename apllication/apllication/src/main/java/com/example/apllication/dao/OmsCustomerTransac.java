//package com.example.apllication.dao;
//
//import com.example.apllication.entity.OmsCustomerData;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
//@Repository
//public class OmsCustomerTransac implements OmsCustomer{
//
//    private EntityManager entityManager;
//
//    @Autowired
//    public OmsCustomerTransac(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<OmsCustomerData> findall(){
//
//        TypedQuery<OmsCustomerData> theQuery=entityManager.createQuery("from oms",OmsCustomerData.class);
//
//        List<OmsCustomerData> e1=theQuery.getResultList();
//
//        return e1;
//    }
//
//
//
//}
