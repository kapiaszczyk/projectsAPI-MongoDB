package dev.kapiaszczyk.projectsAPI.controller;

import dev.kapiaszczyk.projectsAPI.document.Project;
import dev.kapiaszczyk.projectsAPI.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
public class ProjectsController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        return new ResponseEntity<>(projectService.getAllProjects(), HttpStatus.OK);
    }

    @GetMapping("/{projectPublicId}")
    public ResponseEntity<Project> getProjectByProjectPublicId(@PathVariable("projectPublicId") int projectPublicId) {
        Optional<Project> project = projectService.getProjectByProjectPublicId(projectPublicId);
        if (project.isPresent()) {
            return ResponseEntity.ok(project.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/name/{projectName}")
    public ResponseEntity<List<Project>> getProjectByProjectName(@PathVariable("projectName") String projectName) {
        List<Project> projects = projectService.getProjectByProjectName(projectName);
        if (projects.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(projects);
        }
    }

    @GetMapping("/language/{projectLanguage}")
    public ResponseEntity<List<Project>> getProjectByProjectLanguage(@PathVariable("projectLanguage") String projectLanguage) {
        List<Project> projects = projectService.getProjectByProjectLanguage(projectLanguage);
        if (projects.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(projects);
        }
    }

}
