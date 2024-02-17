package stsPackage.serviceImpl;

import stsPackage.entity.*;
import stsPackage.repository.*;
import stsPackage.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RegistrationImpl implements RegistrationService{

    @Autowired
    private StudentRepo studentRepository;

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> fetchAllStudents() {
        List<StudentEntity> allStudents = studentRepository.findAll();
        return allStudents;
    }

    @Override
    public StudentEntity getStudentBySr_no(Long id) {
        Optional<StudentEntity> student = studentRepository.findById(id);
            return student.get();
    }

    @Override
    public StudentEntity updateEmployeeById(Long id, StudentEntity student) {
        Optional<StudentEntity> employee1 = studentRepository.findById(id);

        if (employee1.isPresent()) {
            StudentEntity originalEmployee = employee1.get();

            if (Objects.nonNull(student.getStudent_name()) && !"".equalsIgnoreCase(student.getStudent_name())) {
                originalEmployee.setStudent_name(student.getStudent_name());
            }
            if (Objects.nonNull(student.getStandard())) {
                originalEmployee.setStandard(student.getStandard());
            }
            return studentRepository.save(originalEmployee);
        }
        return null;
    }

    @Override
    public String deleteDepartmentById(Long id) {
        if (studentRepository.findById(id).isPresent()) {
            studentRepository.deleteById(id);
            return "Student details deleted successfully";
        }
        return "No such employee in the database";
    }
}
