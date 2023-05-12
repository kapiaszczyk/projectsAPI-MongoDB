package dev.kapiaszczyk.projectsAPI.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Set;

@Document(collection = "projects")
public class Project {

    @Id
    private ObjectId projectId;
    private int projectPublicId;
    private String projectName;
    private String projectDescription;
    private String projectLanguage;
    private String projectURL;

    private Set<Technology> projectTechnologies;

    public ObjectId getProjectId() {
        return projectId;
    }

    public void setProjectId(ObjectId projectId) {
        this.projectId = projectId;
    }

    public int getProjectPublicId() {
        return projectPublicId;
    }

    public void setProjectPublic(int publicId) {
        this.projectPublicId = publicId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public Project(ObjectId projectId, int projectPublicId, String projectTitle, String projectDescription, String projectLanguage, String projectURL, Set<Technology> projectTechnologies) {
        this.projectId = projectId;
        this.projectPublicId = projectPublicId;
        this.projectName = projectTitle;
        this.projectDescription = projectDescription;
        this.projectLanguage = projectLanguage;
        this.projectURL = projectURL;
        this.projectTechnologies = projectTechnologies;
    }

    public Project() {
    }
}
