package africa.semicolon.jijiReplica.utils;

import africa.semicolon.jijiReplica.data.models.Lister;
import africa.semicolon.jijiReplica.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiReplica.dtos.response.RegisterListerResponse;

import java.time.format.DateTimeFormatter;

public class ModelMapper {

    public static Lister map(RegisterListerRequest request){

        Lister lister = new Lister();

        lister.setEmail(request.getEmail());
        lister.setLocation(request.getLocation());
        lister.setPhoneNumber(request.getPhoneNumber());
        lister.setFullName(request.getFullName());

        return lister;
    }

    public static RegisterListerResponse map( Lister lister){

        RegisterListerResponse response = new RegisterListerResponse();

        response.setDbId(lister.getId());
        response.setDateAndTimeCreated(DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh/mm/a").format(lister.getDateRegistered()));

        return response;
    }
}
