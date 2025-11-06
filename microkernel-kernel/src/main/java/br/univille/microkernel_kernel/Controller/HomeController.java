package br.univille.microkernel_kernel.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus.Series;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private Map<String, DefaultService> services;

    @GetMapping
    public ResponseEntity<String> index(){

        for(var umService : Series.values()){
            umService.doWork(null);
        }

        return ResponseEntity.ok().build();
    }
}
