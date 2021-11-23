package africa.semicolon.jijiReplica.data.repositories;

import africa.semicolon.jijiReplica.data.models.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends MongoRepository<Listing,String> {

}
