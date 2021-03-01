package coursemanage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

@Table(name = "students")
public class Student extends User {

    private Integer year;
}

