package dev.kapiaszczyk.projectsAPI.repository;

import dev.kapiaszczyk.projectsAPI.document.Project;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends MongoRepository<Project, ObjectId> {

        Optional<Project> findByProjectPublicId(int projectPublicId);

}
