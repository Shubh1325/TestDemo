package stsPackage.service;

import java.util.List;

import stsPackage.entity.StudentEntity;

public interface RegistrationService {
	
	
	StudentEntity saveStudent(StudentEntity employee);

	    List<StudentEntity> fetchAllStudents();

	    StudentEntity getStudentBySr_no(Long id);

	    StudentEntity updateEmployeeById(Long sr_no, StudentEntity student);

	    String deleteDepartmentById(Long sr_no);
	}

