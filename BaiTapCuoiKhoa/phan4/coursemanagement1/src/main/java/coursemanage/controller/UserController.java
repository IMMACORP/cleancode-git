package coursemanage.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import coursemanage.service.UserService;
import coursemanage.dto.UserReqDto;
import coursemanage.dto.UserResDto;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/api/v1/users")
    @ApiOperation("Create user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Create user successfully")
    })
    public ResponseEntity<UserResDto> createUser(@Valid @RequestBody UserReqDto userReqDto) {
        UserResDto response = userService.saveUser(userReqDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/api/v1/users")
    @ApiOperation("Update user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Update user successfully"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public ResponseEntity<UserResDto> updateUser(@Valid @RequestBody UserReqDto userReqDto) {
        UserResDto response = userService.saveUser(userReqDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
