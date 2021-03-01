package coursemanage.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudentDto {

    @ApiModelProperty(value = "Year", example = "2")
    private Integer year;
}

