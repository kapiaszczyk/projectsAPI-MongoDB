package dev.kapiaszczyk.projectsAPI.controller;

import dev.kapiaszczyk.projectsAPI.document.Project;
import dev.kapiaszczyk.projectsAPI.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

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

    @PostMapping("/add")
    public ResponseEntity<Project> addProject(@RequestBody Project project) {
        return new ResponseEntity<>(projectService.addProject(project), HttpStatus.CREATED);
    }

    @PutMapping("/update/{projectPublicId}")
    public ResponseEntity<Project> updateProject(@PathVariable("projectPublicId") int projectPublicId, @RequestBody Project project) {
        Optional<Project> projectOptional = projectService.getProjectByProjectPublicId(projectPublicId);
        if (projectOptional.isPresent()) {
            Project projectToUpdate = projectOptional.get();
            projectToUpdate.setProjectName(project.getProjectName());
            projectToUpdate.setProjectDescription(project.getProjectDescription());
            projectToUpdate.setProjectLanguage(project.getProjectLanguage());
            projectToUpdate.setProjectURL(project.getProjectURL());
            projectToUpdate.setProjectPublicId(project.getProjectPublicId());
            return new ResponseEntity<>(projectService.updateProject(projectToUpdate), HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
