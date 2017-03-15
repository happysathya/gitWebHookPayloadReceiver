package com.happysathya.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.happysathya.model.GitPushData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitPushDataController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GitPushDataController.class);

    @PostMapping("/data")
    public GitPushData receiveGitPushData(@RequestBody GitPushData data) throws JsonProcessingException {
        LOGGER.info(new ObjectMapper().writeValueAsString(data));
        return data;
    }
}
