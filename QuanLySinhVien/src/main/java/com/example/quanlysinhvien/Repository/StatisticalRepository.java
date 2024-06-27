package com.example.quanlysinhvien.Repository;

import com.example.quanlysinhvien.Entity.Statistical;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticalRepository extends CrudRepository<Statistical, Integer> {
}
