package com.gustavomartini.dsvendas.services;

import com.gustavomartini.dsvendas.dto.SaleDTO;
import com.gustavomartini.dsvendas.dto.SaleSuccessRateDTO;
import com.gustavomartini.dsvendas.dto.SaleSumDTO;
import com.gustavomartini.dsvendas.entities.Sale;
import com.gustavomartini.dsvendas.repositories.SaleRepository;
import com.gustavomartini.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessRateDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }

}
