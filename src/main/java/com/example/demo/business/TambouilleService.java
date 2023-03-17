package com.example.demo.business;

import org.springframework.stereotype.Service;

import com.example.demo.aop.annotations.LogAround;
import com.example.demo.rest.Client;

@Service
public class TambouilleService {
    
    @LogAround
    public String doMaTambouilleSecrete(Client client) {
        return String.format("Tambouille secrete du client %s !", client.getName());
    }
}
