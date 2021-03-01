package coursemanage.dto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CourseSearchResDto {
    @ApiModelProperty(value = "Course id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "Course name", example = "Spring Boot Fundamental")
    private String name;

    @ApiModelProperty(value = "Location", example = "Hanoi CS1")
    private String location;

    @ApiModelProperty(value = "Teacher", example = "Vu Van B")
    private String teacherName;
}
