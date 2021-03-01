package coursemanage.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TeacherDto {

    @NotBlank
    @ApiModelProperty(value = "Phone", example = "0987654321")
    private String phone;

    @NotBlank
    @ApiModelProperty(value = "Experiences", example = "1")
    private Integer experiences;
}
