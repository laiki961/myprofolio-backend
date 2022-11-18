package com.myprofolio.myprofoliobackend.api;

import com.myprofolio.myprofoliobackend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectApi {
    @Autowired
    private ProjectService exampleService;


}
