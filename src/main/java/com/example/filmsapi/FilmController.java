package com.example.filmsapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {
    private List<Film> films = new ArrayList<>();

    public Film createFilm(Film filmToCreate) {
        films.add(filmToCreate);
        return filmToCreate;
    }

    public List<Film> getFilms() throws Exception {
        return films;
    }

    public Film getFilm(String id) throws Exception {
        for (Film film : new ArrayList<>(films)) {
            if (film.getId().equals(id)) {
                return film;
            }
        }
        throw new Exception("No s'ha trobat");
    }

    public void removeAllFilm() {
        films = new ArrayList<>();
    }

    public void removeFilm(String id) {
        for (Film film : new ArrayList<>(films)) {
            if (film.getId().equals(id)) {
                films.remove(film);
            }
        }
    }

    public void updateFilm(@RequestBody Film filmToUpdate, @PathVariable String id) throws Exception {
        for (Film film : new ArrayList<>(films)) {
            if (film.getId().equals(id)) {
                film.setTitle(filmToUpdate.getTitle());
                film.setAuthor(filmToUpdate.getAuthor());
                film.setIsPorn(filmToUpdate.isPorn());
                return;
            }
        }
        throw new Exception("No s'ha trobat");
    }
}
