package coursemanage.controller;

import coursemanage.dto.CourseSearchReqDto;
import coursemanage.dto.CourseSearchResDto;
import coursemanage.entity.SortCourseByNameStrategy;
import coursemanage.entity.SortCourseByOpenedStrategy;
import coursemanage.service.CourseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    @ApiOperation("Get courses")
    @ApiResponses({ @ApiResponse(code = 200, message = "Get courses successfully") })
    public ResponseEntity<List<CourseSearchResDto>> getCourses(@RequestParam(required = false) String keyword, String sortBy) {
        CourseSearchReqDto courseSearchReqDto = new CourseSearchReqDto();
        if (sortBy != null) {
            if ("name".equals(sortBy)) {
                courseService.setSortCourseStrategy(new SortCourseByNameStrategy());
            } else if ("opened".equals(sortBy)) {
                courseService.setSortCourseStrategy(new SortCourseByOpenedStrategy());
            }
        }
        courseSearchReqDto.setKeyword(keyword);
        courseSearchReqDto.setSortBy(sortBy);
        List<CourseSearchResDto> courses = courseService.getCourses(courseSearchReqDto);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}
