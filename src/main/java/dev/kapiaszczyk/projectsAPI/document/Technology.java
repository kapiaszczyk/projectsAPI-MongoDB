package dev.kapiaszczyk.projectsAPI.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "technologies")
public class Technology {

    @Id
    private ObjectId technologyId;
    private String technologyName;

    public ObjectId getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(ObjectId technologyId) {
        this.technologyId = technologyId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }


    public Technology(ObjectId technologyId, String technologyName, String technologyDescription) {
        this.technologyId = technologyId;
        this.technologyName = technologyName;
    }

    public Technology() {
    }
}
