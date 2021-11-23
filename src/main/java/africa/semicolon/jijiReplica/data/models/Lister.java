package africa.semicolon.jijiReplica.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("listers")
@Data
public class Lister {
    @Id
    private String id;

    private String fullName;
    private String phoneNumber;
    private String location;
    private String email;
    private LocalDateTime dateRegistered = LocalDateTime.now();

}
