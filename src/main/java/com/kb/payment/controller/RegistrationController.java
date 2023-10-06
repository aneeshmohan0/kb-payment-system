package com.kb.payment.controller;

import com.kb.payment.dto.SubmitRequestDto;
import com.kb.payment.policy.Policy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
@Slf4j
public class RegistrationController {

    @Autowired
    private Policy policy;

    @PostMapping("/request")
    public ResponseEntity<String> submitRequest(@RequestBody SubmitRequestDto requestDto) {

        log.info(requestDto.toString());

        // Assuming successful submission for this example
        return new ResponseEntity<>("Request submitted successfully", HttpStatus.OK);
    }
}
