package com.gustavomartini.dsvendas.repositories;

import com.gustavomartini.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
