package dev.kapiaszczyk.projectsAPI.repository;

import dev.kapiaszczyk.projectsAPI.document.Technology;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends MongoRepository<Technology, ObjectId> {
}
