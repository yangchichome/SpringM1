package com.example.springm1;

import com.example.springm1.modal.Course;
import com.example.springm1.repository.CourseRepository;
import com.example.springm1.service.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class CourseServiceUnitTest {

    @Mock
    private CourseService courseService;

    @Mock
    private CourseRepository courseRepository;

    @BeforeEach
    public void setup() {
        // No need to call MockitoAnnotations.openMocks(this) anymore
    }

    @Test
    public void testCourseService() {
        List<Course> courseList = new ArrayList<>();

        given(courseRepository.findAllClasses()).willReturn(courseList);

        List<Course> result = courseService.findAllCourses();

        assertTrue(result.isEmpty());
    }
}
