package dev.kapiaszczyk.projectsAPI.controller;

import dev.kapiaszczyk.projectsAPI.document.Technology;
import dev.kapiaszczyk.projectsAPI.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    @GetMapping
    public ResponseEntity<List<Technology>> getAllTechnologies() {
        return new ResponseEntity<>(technologyService.getAllTechnologies(), HttpStatus.OK);
    }

}
