package org.academiadecodigo.javabank.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestHelloController {

    @RequestMapping(method = RequestMethod.GET, value = "api/hello")
    public HelloPojo helloWorld(@RequestParam(value = "name", defaultValue = "World") String str){

        HelloPojo helloPojo = new HelloPojo("Olaaaaaaaaa " + str);
        return helloPojo;
    }

}
