package com.example.demo;
import com.example.demo.api.GreetApi;
import com.example.demo.model.SampleMsg;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
@CrossOrigin("*")
public class GreetController implements GreetApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return GreetApi.super.getRequest();
    }

    @Override
    public ResponseEntity<SampleMsg> findGreetByStatus(String status) {
        SampleMsg sampleMsg=new SampleMsg();
        sampleMsg.message("hello, "+status);
        return ResponseEntity.ok(sampleMsg);
    }

    @Override
    public ResponseEntity<SampleMsg> getCall() {
        SampleMsg sampleMsg=new SampleMsg();
        sampleMsg.message("hello, World");
        return ResponseEntity.ok(sampleMsg);
    }
}
