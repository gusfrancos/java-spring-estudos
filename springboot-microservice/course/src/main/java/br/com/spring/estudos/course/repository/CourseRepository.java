package br.com.spring.estudos.course.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.spring.estudos.course.model.Course;



public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
