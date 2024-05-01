package com.bilheteunico.SPTrans.repositories;

import com.bilheteunico.SPTrans.entity.StopPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopPointRepository extends JpaRepository<StopPoint, Long> {

}