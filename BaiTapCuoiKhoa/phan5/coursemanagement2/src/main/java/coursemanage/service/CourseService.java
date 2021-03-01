package coursemanage.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.cache.annotation.Cacheable;
import coursemanage.dto.CourseSearchReqDto;
import coursemanage.dto.CourseSearchResDto;
import coursemanage.entity.Course;
import coursemanage.entity.CourseMapper;
import coursemanage.entity.ISortCourseStrategy;
import coursemanage.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    private final CourseMapper courseMapper;

    private ISortCourseStrategy sortCourseStrategy;

    public void setSortCourseStrategy(ISortCourseStrategy sortCourseStrategy) {
        this.sortCourseStrategy = sortCourseStrategy;
    }

    @Cacheable(value = "courses", keyGenerator = "getCourseKeyGenerator")
    @Transactional(readOnly = true)
    public List<CourseSearchResDto> getCourses(CourseSearchReqDto courseReqSearchDto) {
        List<Course> courses = new ArrayList<>();
        String keyword = courseReqSearchDto.getKeyword();
        String sortBy = courseReqSearchDto.getSortBy();
        if (sortBy == null) {
            if (keyword == null) {
                courses = courseRepository.findAll();
            } else if (keyword != null) {
                courses = courseRepository.findAllByNameLike("%" + keyword + "%");
            }
        } else if (sortBy != null) {
            Sort sort = sortCourseStrategy.getSort();
            if (keyword == null) {
                courses = courseRepository.findAll(sort);
            } else if (keyword != null) {
                courses = courseRepository.findAllByNameLike(sort, "%" + keyword + "%");
            }
        }
        return courses.stream().map(course -> courseMapper.convertToCourseSearchResDto(course)).collect(Collectors.toList());
    }
}
