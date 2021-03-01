package coursemanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import coursemanage.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
