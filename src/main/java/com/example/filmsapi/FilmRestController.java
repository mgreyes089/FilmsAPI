package com.example.filmsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmRestController {
    private FilmController controller;

    public FilmRestController(FilmController controller) {
        this.controller = controller;
    }

    @PostMapping("/films")
    public Film createFilm(@RequestBody Film filmToCreate) {
       return controller.createFilm(filmToCreate);
    }

    @GetMapping("/films")
    public List<Film> getFilms() throws Exception {
        return controller.getFilms();
    }

    @GetMapping("/films/{id}")
    public Film getFilm(@PathVariable String id) throws Exception {
       return controller.getFilm(id);
    }

    @DeleteMapping("/films")
    public void removeAllFilm() {
        controller.removeAllFilm();
    }

    @DeleteMapping("/films/{id}")
    public void removeFilm(@PathVariable String id) {
        controller.removeFilm(id);
    }

    @PutMapping("/films/{id}")
    public void updateFilm(@RequestBody Film filmToUpdate, @PathVariable String id) throws Exception {
        controller.updateFilm(filmToUpdate,id);
    }

}
