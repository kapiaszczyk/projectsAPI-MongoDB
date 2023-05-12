package dev.kapiaszczyk.projectsAPI.service;

import dev.kapiaszczyk.projectsAPI.document.Project;
import dev.kapiaszczyk.projectsAPI.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectByProjectPublicId(int projectPublicId) {
        return projectRepository.findByProjectPublicId(projectPublicId);
    }

    public List<Project> getProjectByProjectName(String projectName) {
        return projectRepository.findByProjectNameLike(projectName);
    }



}
