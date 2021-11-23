package africa.semicolon.jijiReplica.services;

import africa.semicolon.jijiReplica.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiReplica.dtos.response.RegisterListerResponse;

public interface ListerService {

    public RegisterListerResponse registerLister(RegisterListerRequest registerListerRequest);

}
