package africa.semicolon.jijiReplica.services;

import africa.semicolon.jijiReplica.data.models.Lister;
import africa.semicolon.jijiReplica.data.repositories.ListerRepository;
import africa.semicolon.jijiReplica.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiReplica.dtos.response.RegisterListerResponse;
import africa.semicolon.jijiReplica.exceptions.DuplicateEmailException;
import africa.semicolon.jijiReplica.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListerServiceImpl implements ListerService{

    @Autowired
    private ListerRepository listerRepository;

    @Override
    public RegisterListerResponse registerLister(RegisterListerRequest registerListerRequest) {

        Optional<Lister>optionalLister = listerRepository.findListerByEmail(registerListerRequest.getEmail());
        if (optionalLister.isPresent()) throw new DuplicateEmailException(registerListerRequest.getEmail() + "already exist");

        Lister lister = ModelMapper.map(registerListerRequest);

        Lister savedLister = listerRepository.save(lister);

        return ModelMapper.map(savedLister);
    }
}
