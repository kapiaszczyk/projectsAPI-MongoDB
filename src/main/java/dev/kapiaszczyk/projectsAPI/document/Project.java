package dev.kapiaszczyk.projectsAPI.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Set;

@Document(collection = "projects")
public class Project {

    @Id
    private ObjectId projectId;
    private String projectTitle;
    private String projectDescription;
    private String projectLanguage;
    private String projectURL;

    @DocumentReference
    private Set<Technology> projectTechnologies;

    public ObjectId getProjectId() {
        return projectId;
    }

    public void setProjectId(ObjectId projectId) {
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

    public Set<Technology> getProjectTechnologies() {
        return projectTechnologies;
    }

    public void setProjectTechnologies(Set<Technology> projectTechnologies) {
        this.projectTechnologies = projectTechnologies;
    }

    public Project(ObjectId projectId, String projectTitle, String projectDescription, String projectLanguage, String projectURL, Set<Technology> projectTechnologies) {
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
