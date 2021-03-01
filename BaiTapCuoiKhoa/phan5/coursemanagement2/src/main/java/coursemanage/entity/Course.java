package coursemanage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private String location;

    private String opened;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


}
