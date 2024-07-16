package com.example.apllication.dao;

import com.example.apllication.entity.CrediteMemoData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrediteMemoRepository extends JpaRepository<CrediteMemoData,Integer> {
}
