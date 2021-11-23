package africa.semicolon.jijiReplica.data.repositories;

import africa.semicolon.jijiReplica.data.models.Lister;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ListerRepository extends MongoRepository<Lister,String> {

    Optional<Lister>findListerByEmail(String email);
}
