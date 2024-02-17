package stsPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import stsPackage.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Long> {

}
