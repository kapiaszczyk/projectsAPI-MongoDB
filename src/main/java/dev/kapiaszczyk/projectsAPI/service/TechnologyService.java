package dev.kapiaszczyk.projectsAPI.service;

import dev.kapiaszczyk.projectsAPI.document.Technology;
import dev.kapiaszczyk.projectsAPI.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    public List<Technology> getAllTechnologies() {
        return technologyRepository.findAll();
    }

}
