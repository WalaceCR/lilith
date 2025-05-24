package com.experiencia.metas.controllers;


import com.experiencia.metas.entities.Metas;
import com.experiencia.metas.service.MetasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metas")
@Slf4j
public class MetasController {

    @Autowired
    private MetasService metasService;

    @PostMapping("incluir")
    public ResponseEntity<Metas> incluirMetas(@RequestBody Metas meta){
        Metas novaMeta = metasService.salvarMetas(meta);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaMeta);
    }

    @GetMapping("")
    public ResponseEntity<List<Metas>> listarTodasAsMetas(){
        List<Metas> metas = metasService.pesquisarTodasAsMetas();
        return ResponseEntity.ok(metas);
    }


}
