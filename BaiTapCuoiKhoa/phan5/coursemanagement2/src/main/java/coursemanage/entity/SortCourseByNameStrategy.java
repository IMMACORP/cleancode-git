package coursemanage.entity;

import org.springframework.data.domain.Sort;

public class SortCourseByNameStrategy implements ISortCourseStrategy{
    @Override
    public Sort getSort() {
        return Sort.by(Sort.Direction.ASC, "name");
    }
}
