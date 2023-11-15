package br.com.inacio.gestao_vagas.candidate.controller;

import java.util.UUID;

import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;

    
}
