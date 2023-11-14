package it.reply.lezioni.javarest.controller;

import it.reply.lezioni.javarest.model.Docente;
import it.reply.lezioni.javarest.service.DocenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
@RequestMapping("api/v1/docenti")
@CrossOrigin(value = "*")
@Slf4j
public class DocenteController {

    private final DocenteService docenteService;

    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @GetMapping("/login")
    public ResponseEntity<Boolean> login(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        Boolean isLogged = docenteService.doLogin(email, password);
        return ResponseEntity.ok().body(isLogged);
    }

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody Docente docente) {
        log.info("-----REGISTERING DOCENTE {}-----", docente.toString());
        Boolean isRegistered = docenteService.doRegistration(docente);
        return ResponseEntity.ok().body(isRegistered);
    }
}
