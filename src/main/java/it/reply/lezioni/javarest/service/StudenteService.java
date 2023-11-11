package it.reply.lezioni.javarest.service;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import it.reply.lezioni.javarest.model.Studente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class StudenteService {

    public List<Studente> getStudentiHardCoded() {

        log.info("-----GENERAZIONE DEGLI STUDENTI TRAMITE METODO HARDCODED-----");
        List<Studente> retList = new ArrayList<>();

        Studente studente = new Studente("Alessio", "Mazzola", "MZZLSS");
        Studente studente2 = new Studente("Gennaro", "Bullo", "GNRBLL");
        Studente studente3 = new Studente("Claudia", "Breazzano", "CLDBR");
        Studente studente4 = new Studente("Alessio", "Mazzola2", "MZZLSS");
        Studente studente5 = new Studente("Stefano", "Rossi", "");

        retList.add(studente);
        retList.add(studente2);
        retList.add(studente3);
        retList.add(studente4);
        retList.add(studente5);
        log.info("-----GENERAZIONE DEGLI STUDENTI COMPLETATA-----");
        return retList;
    }

    public List<Studente> getStudentiFromFile(String filePath){
        log.info("-----GENERAZIONE DEGLI STUDENTI TRAMITE FILE {}-----", filePath);

        String jsonContent = "";
        try {
            jsonContent = Files.readString(Path.of(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        List<Studente> retList = new Gson().fromJson(jsonContent, List.class);
        log.info("-----GENERAZIONE DEGLI STUDENTI COMPLETATA-----");
        return retList;
    }
}
