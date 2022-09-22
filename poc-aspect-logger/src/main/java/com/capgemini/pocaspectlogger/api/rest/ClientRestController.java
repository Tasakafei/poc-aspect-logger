package com.capgemini.pocaspectlogger.api.rest;

import com.capgemini.pocaspectlogger.aop.annotation.LogAround;
import com.capgemini.pocaspectlogger.api.rest.dto.in.Criteria;
import com.capgemini.pocaspectlogger.api.rest.dto.out.Client;
import com.capgemini.pocaspectlogger.api.rest.dto.out.Mail;
import com.capgemini.pocaspectlogger.api.rest.dto.out.MailToString;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientRestController {

    @PostMapping("/clients/searches")
    @LogAround
    public List<Client> findClientsByCriteria(@RequestBody Criteria criteria) {
        Client c1 = new Client().setId(1L).setMail(new Mail("c1@client.fr")).setMailToString(new MailToString("c1@client.fr"));
        Client c2 = new Client().setId(1L).setMail(new Mail("c2@client.fr")).setMailToString(new MailToString("c2@client.fr"));
        return List.of(c1, c2);
    }


}
