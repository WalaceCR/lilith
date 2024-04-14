package br.com.lilith.controller.home.jogador;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
@RequestMapping("/api/magic")
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/dados/{idJogador}")
    public ResponseEntity<?> dadosJogador(@PathVariable String idJogador){
        if (Objects.equals(idJogador, "1")) {
            log.info("Teste controler: ", "Bem vinda Luana Steck");
            return ResponseEntity.ok("Nome de player: Luana Steck");
        }else {
            log.info("Teste controler: ", "Bem vindo Walace Steck");
            return ResponseEntity.ok("Nome de player: Walace Steck");
        }
    }

}
