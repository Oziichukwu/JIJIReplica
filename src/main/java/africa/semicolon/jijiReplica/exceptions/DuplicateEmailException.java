package africa.semicolon.jijiReplica.exceptions;

import africa.semicolon.jijiReplica.dtos.request.RegisterListerRequest;

public class DuplicateEmailException extends JijiReplicaException {

    public DuplicateEmailException(String message) {
        super(message);
    }
}
