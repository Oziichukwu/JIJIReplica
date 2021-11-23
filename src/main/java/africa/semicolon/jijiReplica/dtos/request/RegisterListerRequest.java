package africa.semicolon.jijiReplica.dtos.request;


import lombok.Data;

@Data
public class RegisterListerRequest {

    private String fullName;
    private String phoneNumber;
    private String location;
    private String email;

}
