package com.gustavomartini.dsvendas.services;

import com.gustavomartini.dsvendas.dto.SellerDTO;
import com.gustavomartini.dsvendas.entities.Seller;
import com.gustavomartini.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
