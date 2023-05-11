package dev.kapiaszczyk.projectsAPI.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "projects")
public class Project {

    @Id
    private String projectId;
    private String projectTitle;
    private String projectDescription;
    private String projectLanguage;
    private String projectURL;
    private Set<String> projectTechnologies;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectLanguage() {
        return projectLanguage;
    }

    public void setProjectLanguage(String projectLanguage) {
        this.projectLanguage = projectLanguage;
    }

    public String getProjectURL() {
        return projectURL;
    }

    public void setProjectURL(String projectURL) {
        this.projectURL = projectURL;
    }

    public Set<String> getProjectTechnologies() {
        return projectTechnologies;
    }

    public void setProjectTechnologies(Set<String> projectTechnologies) {
        this.projectTechnologies = projectTechnologies;
    }

    public Project(String projectId, String projectTitle, String projectDescription, String projectLanguage, String projectURL, Set<String> projectTechnologies) {
        this.projectId = projectId;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.projectLanguage = projectLanguage;
        this.projectURL = projectURL;
        this.projectTechnologies = projectTechnologies;
    }

    public Project() {
    }
}
