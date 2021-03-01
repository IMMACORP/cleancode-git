package coursemanage.entity;

import org.springframework.data.domain.Sort;

public class SortCourseByOpenedStrategy implements ISortCourseStrategy{
    @Override
    public Sort getSort() {
        return Sort.by(Sort.Direction.DESC, "opened");
    }
}
