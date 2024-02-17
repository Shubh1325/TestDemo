package stsPackage.controller;


import stsPackage.entity.*;
import stsPackage.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/saveStudent")
    public StudentEntity saveStudent(@RequestBody StudentEntity student) {
        return registrationService.saveStudent(student);
    }

    @GetMapping("/fetchstudents")
    public List<StudentEntity> getAllStudents() {
        return registrationService.fetchAllStudents();
    }

    @GetMapping("/getStudent")
    public StudentEntity getStudentBySr_no(@RequestParam("sr_no") Long sr_no) {
        return registrationService.getStudentBySr_no(sr_no);
}

    @PutMapping("/updatestudent")
    public StudentEntity updateStudent(@PathVariable("sr_no") Long sr_no, @RequestBody StudentEntity student) {
        return registrationService.updateEmployeeById(sr_no, student);
    }

    @DeleteMapping("/deleteStudent")
    public String deleteEmployee(@PathVariable("sr_no") Long sr_no) {
        return registrationService.deleteDepartmentById(sr_no);
    }
}
