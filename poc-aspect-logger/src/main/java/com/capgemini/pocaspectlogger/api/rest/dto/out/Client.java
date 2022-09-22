package com.capgemini.pocaspectlogger.api.rest.dto.out;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@ToString
@Accessors(chain = true)
public class Client {
    private Long id;
    private String name;
    private Mail mail;
    private MailToString mailToString;
}
