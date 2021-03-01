package coursemanage.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity

@Table(name = "teachers")
public class Teacher extends User {

    private String phone;

    private Integer experiences;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses = new ArrayList<>();
}
