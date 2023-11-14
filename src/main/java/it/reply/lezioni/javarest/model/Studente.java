package it.reply.lezioni.javarest.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studente {

    private String nome;
    private String cognome;
    private String codiceFiscale;

}
