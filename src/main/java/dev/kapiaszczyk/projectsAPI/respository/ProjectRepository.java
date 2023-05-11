package dev.kapiaszczyk.projectsAPI.respository;

import dev.kapiaszczyk.projectsAPI.document.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
}
