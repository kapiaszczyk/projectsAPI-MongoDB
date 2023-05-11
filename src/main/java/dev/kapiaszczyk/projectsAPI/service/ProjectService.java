package dev.kapiaszczyk.projectsAPI.service;

import dev.kapiaszczyk.projectsAPI.document.Project;
import dev.kapiaszczyk.projectsAPI.respository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

}
