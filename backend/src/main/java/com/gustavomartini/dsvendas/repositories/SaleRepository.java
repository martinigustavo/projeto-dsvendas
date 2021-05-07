package com.gustavomartini.dsvendas.repositories;

import com.gustavomartini.dsvendas.dto.SaleSumDTO;
import com.gustavomartini.dsvendas.dto.SaleSuccessRateDTO;
import com.gustavomartini.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.gustavomartini.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.gustavomartini.dsvendas.dto.SaleSuccessRateDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessRateDTO> successGroupedBySeller();
}
