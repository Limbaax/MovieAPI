package dev.mookies.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.mookies.movies.domain.Reviews;


@Repository
public interface ReviewRepository  extends MongoRepository<Reviews, ObjectId>{

}
