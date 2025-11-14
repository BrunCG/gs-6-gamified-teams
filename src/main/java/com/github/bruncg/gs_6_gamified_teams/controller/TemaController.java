package com.github.bruncg.gs_6_gamified_teams.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.bruncg.gs_6_gamified_teams.model.dto.TemaResponse;
import com.github.bruncg.gs_6_gamified_teams.service.TemaService;

@RestController
public class TemaController {

    @Autowired
    private TemaService service;

    @GetMapping("/info")
    public ResponseEntity<List<TemaResponse>> findAll(){
        List<TemaResponse> response =
                service.getAll().stream()
                        .map(p -> new TemaResponse().toDto(p))
                        .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }


}