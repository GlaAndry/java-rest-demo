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
        Studente studente4 = new Studente("Alessio", "De Angelis", "ANGLSS");
        Studente studente5 = new Studente("Stefano", "Rossi", "STFRBBF");
        Studente studente6 = new Studente("Silvia", "Di Lauro", "SLVLSS");
        Studente studente7 = new Studente("Edoardo", "Rubino", "EDRBN");
        Studente studente8 = new Studente("Antonino", "Papillo", "PPPPP");
        Studente studente9 = new Studente("Fabio", "Cannarozzo", "FBCNZ");
        Studente studente10 = new Studente("Ilaria", "Salvetti", "ILRSLV");

        retList.add(studente);
        retList.add(studente2);
        retList.add(studente3);
        retList.add(studente4);
        retList.add(studente5);
        retList.add(studente6);
        retList.add(studente7);
        retList.add(studente8);
        retList.add(studente9);
        retList.add(studente10);
        log.info("-----GENERAZIONE DEGLI STUDENTI COMPLETATA-----");
        return retList;
    }

}
