package cz.uhk.ppro.rest2.controllers;

import cz.uhk.ppro.rest2.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public void saveStudent(@RequestBody Student student) {
        System.out.println("Saving student " + student.getLastName());
    }
}
