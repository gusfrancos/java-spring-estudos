package br.com.spring.estudos.course.endpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.estudos.core.model.Course;
import br.com.spring.estudos.course.endpoint.service.CourseService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("course")
//@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {
    private final CourseService courseService;

    //@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @GetMapping(value="all", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
        return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
    }
}
