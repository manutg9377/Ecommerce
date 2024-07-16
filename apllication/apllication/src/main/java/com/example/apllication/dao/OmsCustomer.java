package com.example.apllication.dao;

import com.example.apllication.entity.OmsCustomerData;
import com.example.apllication.entity.OmsOrdersData;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OmsCustomer extends JpaRepository<OmsCustomerData,Integer> {
    List<OmsCustomerData> findByemail(String s);

    List<OmsCustomerData> findByemailContaining(String s);

    List<OmsCustomerData> findByCustomerDataExtendCountry(String omsOrdersDataCountry);

    List<OmsCustomerData> findByFirstNameAndLastName(String fn,String ln);

    @Query("select s from OmsCustomerData s where s.email=?1")
    OmsCustomerData getEmailAddress(String EmailAddress);

    @Query("select s.firstName from OmsCustomerData s where s.email=?1")
    String getFirstNameEmailAddress(String EmailAddress);

   @Query(value="SELECT * FROM oms_customer_data s where s.email_address=?1",
   nativeQuery = true)
   OmsCustomerData getFirstNameEmailAddressNative(String EmailAddress);


    @Query(value="SELECT * FROM oms_customer_data s where s.email_address=:EmailID",
            nativeQuery = true)
    OmsCustomerData getFirstNameEmailAddressNativeParam(@Param("EmailID") String EmailAddress);

    @Modifying
    @Transactional
    @Query(value="update oms_customer_data set email_address=?1 where id=?2",
            nativeQuery = true)
    int getFirstNameEmailAddressTransactional(String email,Integer id);

}
