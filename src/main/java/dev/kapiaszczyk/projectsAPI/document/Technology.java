package dev.kapiaszczyk.projectsAPI.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "technologies")
public class Technology {

    @Id
    private ObjectId technologyId;
    private int technologyPublicId;
    private String technologyName;
    private String technologyDescription;

    public ObjectId getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(ObjectId technologyId) {
        this.technologyId = technologyId;
    }

    public int getTechnologyPublicId() {
        return technologyPublicId;
    }

    public void setTechnologyPublicId(int technologyPublicId) {
        this.technologyPublicId = technologyPublicId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getTechnologyDescription() {
        return technologyDescription;
    }

    public void setTechnologyDescription(String technologyDescription) {
        this.technologyDescription = technologyDescription;
    }

    public Technology(ObjectId technologyId, int technologyPublicId, String technologyName, String technologyDescription) {
        this.technologyId = technologyId;
        this.technologyPublicId = technologyPublicId;
        this.technologyName = technologyName;
        this.technologyDescription = technologyDescription;
    }

    public Technology() {
    }
}
