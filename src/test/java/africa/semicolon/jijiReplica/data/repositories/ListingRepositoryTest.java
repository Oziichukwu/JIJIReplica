package africa.semicolon.jijiReplica.data.repositories;

import africa.semicolon.jijiReplica.data.models.Condition;
import africa.semicolon.jijiReplica.data.models.Listing;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ListingRepositoryTest {

    @Autowired
    private ListingRepository listingRepository;

    @Test
    public void saveListingTest(){
        Listing listing = new Listing();
        listing.setCondition(Condition.NEW);
        listing.setName("iphone");
        listing.setLongDescription("This is original");
        listing.setShortDescription("This phone go work well well");
        Listing savedListing = listingRepository.save(listing);
        assertEquals("iphone", savedListing.getName());
    }

}