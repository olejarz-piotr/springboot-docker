package pl.olejarz.springbootdocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {


    @Value("${envname}")
    private String envname;

    @GetMapping("/test")
    public String test(){
        return "Testing in progress" + envname;
    }

}
