package coursemanage.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CourseSearchReqDto {
    @ApiModelProperty(value = "Keyword", example = "Spring")
    private String keyword;

    @ApiModelProperty(value = "sortBy", example = "name")
    private String sortBy;
}
