package coursemanage.entity;
import coursemanage.dto.UserReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFactory {

    private final UserMapper userMapper;

    public User createUser(UserReqDto userReqDto){
        if ("STUDENT".equals(userReqDto.getMode())) {
            return userMapper.convertToStudent(userReqDto);
        } else if ("TEACHER".equals(userReqDto.getMode())) {
            return userMapper.convertToTeacher(userReqDto);
        } else {
            throw new UnsupportedOperationException("Unsupported register mode");
        }
    }
}
