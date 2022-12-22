package com.itc.jpacruddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course (1L, "Learn AWS", "Institut Teknologi Cirebon"),
                new Course (2L, "Learn DevOps", "Institut Teknologi Cirebon"),
                new Course (3L, "Learn Software Engineer", "Institut Teknologi Cirebon"),
                new Course (3L, "Learn Networking", "Institut Teknologi Cirebon")
        );
    }
}
