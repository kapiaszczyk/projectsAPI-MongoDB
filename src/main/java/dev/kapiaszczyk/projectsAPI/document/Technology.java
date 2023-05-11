package dev.kapiaszczyk.projectsAPI.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "technologies")
public class Technology {

    @Id
    private ObjectId technologyId;
    private String technologyName;
    private String technologyDescription;
}
