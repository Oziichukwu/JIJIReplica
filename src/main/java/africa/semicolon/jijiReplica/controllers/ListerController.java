package africa.semicolon.jijiReplica.controllers;


import africa.semicolon.jijiReplica.dtos.request.RegisterListerRequest;
import africa.semicolon.jijiReplica.exceptions.JijiReplicaException;
import africa.semicolon.jijiReplica.services.ListerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ListerController {

    @Autowired
    private ListerService listerService;

    @PostMapping("/api/lister")
    public ResponseEntity<?>register(@RequestBody RegisterListerRequest request){

        try{
            return new ResponseEntity<>(listerService.registerLister(request), HttpStatus.CREATED);
        }
        catch (JijiReplicaException exception){
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
