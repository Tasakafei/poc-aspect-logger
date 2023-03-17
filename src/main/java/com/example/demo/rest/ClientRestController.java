package com.example.demo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.TambouilleService;

@RestController
public class ClientRestController {

    private TambouilleService tambouilleService;

    public ClientRestController(TambouilleService tambouilleService) {
        this.tambouilleService = tambouilleService;
    }

    @GetMapping("/clients")
    public List<Client> findClients() {
        Client c1 = new Client("C1");
        tambouilleService.doMaTambouilleSecrete(c1);
        Client c2 = new Client("C2");
        tambouilleService.doMaTambouilleSecrete(c2);
        return List.of(c1, c2);
    }
}
