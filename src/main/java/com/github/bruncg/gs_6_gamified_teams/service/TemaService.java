package com.github.bruncg.gs_6_gamified_teams.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.bruncg.gs_6_gamified_teams.model.Tema;

@Service
public class TemaService {

    private List<Tema> Temas = new ArrayList<>();

    public List<Tema> getAll() {
        return Temas;
    }
}