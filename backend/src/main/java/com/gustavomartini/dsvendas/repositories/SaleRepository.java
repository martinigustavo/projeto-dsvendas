package com.gustavomartini.dsvendas.repositories;

import com.gustavomartini.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
