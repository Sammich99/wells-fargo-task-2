package com.wellsfargo.counselor.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolio;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    protected Portfolio(){

    }

    public Portfolio(Client client){
        this.client = client;
    }
}
