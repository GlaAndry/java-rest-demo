package it.reply.lezioni.javarest.controller;

import it.reply.lezioni.javarest.model.Studente;
import it.reply.lezioni.javarest.service.StudenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/studenti")
@CrossOrigin(value = "*")
@Slf4j
public class StudenteController {

    private final StudenteService studenteService;

    public StudenteController(StudenteService studenteService) {
        this.studenteService = studenteService;
    }

    @GetMapping("/findAllStudenti")
    public List<Studente> findAllStudenti() {
        return studenteService.getStudentiHardCoded();
    }
}
