package pl.gtd.dummyclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DummyController {

    @Autowired
    Environment environment;

    @GetMapping(path = "/dummy/{key}", produces = "application/json")
    public String getKey(@PathVariable("key") String key){
        return environment.getProperty(key);
    }

}
