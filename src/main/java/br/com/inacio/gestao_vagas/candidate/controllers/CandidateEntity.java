package br.com.inacio.gestao_vagas.candidate.controllers;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [email] e o campo [username] não deve conter espaço")
    private String username;
    @Email(message = "O campo (email) precisa conter um email válido")
    private String email;
    @Length(min = 10, max = 20)
    private String password;
    private String description;
    private String curriculum;

    
}