package coursemanage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

@Table(name = "teacher")
public class Teacher extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String phone;

    private Integer experiences;
}
