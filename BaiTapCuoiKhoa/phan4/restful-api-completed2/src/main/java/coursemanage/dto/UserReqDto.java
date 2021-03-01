package coursemanage.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Request DTO
 */
@Data
public class UserReqDto {

    @NotBlank
    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "User email", example = "xyz@gmail.com")
    private String email;

    @NotBlank
    @ApiModelProperty(value = "User password", example = "123456")
    private String password;

    @ApiModelProperty(value = "Teacher", example = "{\n" +
            "        \"phone\": \"0987654321\",\n" +
            "        \"experiences\": 5\n" +
            "    }")
    private TeacherDto teacher;
    private StudentDto student;

    @NotBlank
    @ApiModelProperty(value = "User mode", example = "TEACHER or STUDENT")
    private String mode;

}
