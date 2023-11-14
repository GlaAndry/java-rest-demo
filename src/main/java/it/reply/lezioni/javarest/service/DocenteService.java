package it.reply.lezioni.javarest.service;

import com.google.gson.Gson;
import it.reply.lezioni.javarest.model.Docente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
@Service
public class DocenteService {

    public Boolean doLogin(String email, String password) {
        Docente docente = new Docente("Alessio", "Mazzola", "ales.mazzola@reply.it", "password");
        return docente.getEmail().equals(email) && docente.getPassword().equals(password);
    }

    public Boolean doRegistration(Docente docente) {
        Gson gson = new Gson();
        try (PrintWriter out = new PrintWriter("src/main/resources/registration.json")) {
            String json = gson.toJson(docente);
            out.println(json);
            return true;
        } catch (IOException e) {
            //throw new RuntimeException(e);
            log.error("-----ERRORE-----");
            return false;
        }
    }
}
