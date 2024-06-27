package com.example.quanlysinhvien.Repository;

import com.example.quanlysinhvien.Entity.Point;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends CrudRepository<Point, Integer> {
}
