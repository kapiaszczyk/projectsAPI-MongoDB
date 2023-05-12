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

    public List<Project> getProjectByProjectLanguage(String projectLanguage) {
        return projectRepository.findByProjectLanguageLike(projectLanguage);
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }


    public void deleteProject(Project project) {
        projectRepository.delete(project);
    }
}
