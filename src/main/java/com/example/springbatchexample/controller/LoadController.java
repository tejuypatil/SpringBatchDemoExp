package com.example.springbatchexample.controller;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadController {
//    @Autowired
//    JobLauncher jobLauncher;
//
//    @Autowired
//    Job job;
//
//    @GetMapping
//    public void load(){
//
//        JobParameters parameters = new JobParameters(maps);
//        jobLauncher.run(job, parameters);
//    }

}
