package com.example.quanlysinhvien.Repository;

import com.example.quanlysinhvien.Entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SemesterRepository extends JpaRepository<Semester, Integer> {
}
