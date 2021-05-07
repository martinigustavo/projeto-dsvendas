package com.gustavomartini.dsvendas.dto;

import com.gustavomartini.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSuccessRateDTO implements Serializable {
    public static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessRateDTO() {
    }

    public SaleSuccessRateDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
