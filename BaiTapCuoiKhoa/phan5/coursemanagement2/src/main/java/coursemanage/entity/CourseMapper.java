package coursemanage.entity;

import coursemanage.dto.CourseSearchResDto;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public CourseSearchResDto convertToCourseSearchResDto(Course course) {
        CourseSearchResDto courseResDto = new CourseSearchResDto();
        courseResDto.setId(course.getId());
        courseResDto.setName(course.getName());
        courseResDto.setLocation(course.getLocation());
        courseResDto.setTeacherName(course.getTeacher().getName());
        return courseResDto;
    }
}
