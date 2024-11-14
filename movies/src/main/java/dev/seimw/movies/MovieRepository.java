package dev.seimw.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//Data access layer for the API, talks to the database and gets the data back
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
    //Naming this method allows springframework.data.mongodb to understand what we are doing
    Optional<Movie> findMovieByImdbId(String imdbId);
}
