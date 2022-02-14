package com.example.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "stage")
public class StageEndpoint {

    Map<String ,Stage> stages=new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Stage> getAllStages()
    {
        return stages;
    }

    @ReadOperation
    public Stage getStage(@Selector String name)
    {
        return stages.get(name);
    }

    @WriteOperation
    //should be void method. i wanted to print so i use String
    public String setValue(@Selector String name,int stage)
    {
            stages.put(name,new Stage(stage));
            return "Successfully  added";
    }

    static class Stage{
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
