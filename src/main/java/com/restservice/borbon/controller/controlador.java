package com.restservice.borbon.controller;

import com.restservice.borbon.entity.Callback;
import com.restservice.borbon.entity.EmailAge;
import com.restservice.borbon.entity.SwinSwapPhones;
import com.restservice.borbon.repository.CallbackRepository;
import com.restservice.borbon.repository.EmailAgeRepository;
import com.restservice.borbon.repository.SwinSwapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class controlador {

    @Autowired
    private CallbackRepository repository;

    @Autowired
    private SwinSwapRepository swinSwapRepository;

    @Autowired
    private EmailAgeRepository emailAgeRepository;

    @RequestMapping("/listcallback")
    public List<Callback> getListCallback(){
        return repository.findAll();
    }

    @GetMapping(value = "/phones/{phoneId}")
    public ResponseEntity<SwinSwapPhones> getPhoneId(@PathVariable(value="phoneId") Integer phoneId){
       SwinSwapPhones phone = swinSwapRepository.findByPhoneId(phoneId);

       HttpHeaders hd = new HttpHeaders();
       hd.set("Channel","RISKCENTER");

        if(phone == null){
            System.out.println("Error - No se encontró el teléfono.");
        }
        return new ResponseEntity<SwinSwapPhones>(phone,hd,HttpStatus.OK);
    }

    @GetMapping(value="/emails/{emailId}")
    public ResponseEntity<EmailAge> getEmailAge(@PathVariable(value="emailId") String emailId){
        EmailAge email = emailAgeRepository.findByEmail(emailId);
        HttpHeaders hd = new HttpHeaders();
        hd.set("Channel","RISKCENTER");

        if(email == null){
            System.out.println("Error - No se encontró el Email.");
        }
        return new ResponseEntity<EmailAge>(email,hd,HttpStatus.OK);

    }

    @GetMapping(value="/callback/{orderId}")
    public Callback findByIdCallback(@PathVariable(value="orderId") String orderId){
        Optional<Callback> call = repository.findById(orderId);
        Callback reps = call.get();
        return reps;
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value="/updateCallback/{orderId}",
            consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public void updateCallback (@PathVariable(value="orderId") String orderId,
                                    @Valid @RequestBody Callback callback){
        Optional<Callback> call = repository.findById(orderId);
        Callback reps = call.get();
        if(reps != null){
            reps.setS_RESPONSE_CODE(callback.getS_RESPONSE_CODE());
            repository.save(reps);
        }
        RestTemplate template = new RestTemplate();
        ResponseEntity<Callback> responseEntity = template.getForEntity("http://localhost:8888/api/callback/{orderId}",Callback.class,orderId);
        reps = responseEntity.getBody();
        HttpStatus statusCode = responseEntity.getStatusCode();

        System.out.println("Respuesta Callback: " + reps);
        System.out.println("Body: " + reps);
        System.out.println("Status Respuesta: " + statusCode);

    }


    @PostMapping(value="createCallback",
            consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public void createCallback(@RequestBody Callback callback){
        repository.save(callback);
    }


    @DeleteMapping(value="/deleteCallback/{orderId}")
    public void deleteCallback(@PathVariable("orderId") String orderId){
        repository.deleteById(orderId);
    }


}
