package com.restservice.borbon.repository;

import com.restservice.borbon.entity.SwinSwapPhones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwinSwapRepository extends JpaRepository<SwinSwapPhones,Integer> {

    SwinSwapPhones findByPhoneId(Integer phoneId);
}
