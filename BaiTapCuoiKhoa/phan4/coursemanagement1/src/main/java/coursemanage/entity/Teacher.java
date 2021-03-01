package coursemanage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

@Table(name = "teachers")
public class Teacher extends User {

    private String phone;

    private Integer experiences;
}
