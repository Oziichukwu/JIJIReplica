package africa.semicolon.jijiReplica.data.repositories;

import africa.semicolon.jijiReplica.data.models.Lister;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;


@DataMongoTest
class ListerRepositoryTest {

    @Autowired
    ListerRepository listerRepository;

    @Test
    public void saveListersTest(){
        Lister lister = new Lister();
        lister.setFullName("Moses Chukwu");
        lister.setEmail("goodnews@gmail.com");
        lister.setPhoneNumber("082769373763");
        lister.setLocation("village");

        Lister savedLister = listerRepository.save(lister);
        assertEquals("village", savedLister.getLocation());
    }
}