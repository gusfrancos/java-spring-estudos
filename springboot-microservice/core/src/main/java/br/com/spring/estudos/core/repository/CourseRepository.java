package br.com.spring.estudos.core.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.spring.estudos.core.model.Course;



public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
