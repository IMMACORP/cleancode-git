package coursemanage.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotBlank;

/**
 * Response DTO
 */
@Data
public class UserResDto extends RepresentationModel<UserResDto> {


    @NotBlank
    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "User email", example = "xyz@gmail.com")
    private String email;

    @ApiModelProperty(value = "Teacher", example = "{\n" +
            "        \"phone\": \"0987654321\",\n" +
            "        \"experiences\": 5\n" +
            "    }")
    private TeacherDto teacher;

}
