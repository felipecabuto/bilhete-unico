package com.bilheteunico.SPTrans.repositories;

import com.bilheteunico.SPTrans.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {}
