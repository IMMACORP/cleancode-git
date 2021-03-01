package coursemanage.repository;

import coursemanage.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findAllByNameLike(String name);

    List<Course> findAllByNameLike(Sort sort, String name);
}
