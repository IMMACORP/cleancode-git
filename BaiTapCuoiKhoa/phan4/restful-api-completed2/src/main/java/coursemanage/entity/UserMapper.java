package coursemanage.entity;

import coursemanage.dto.UserReqDto;
import coursemanage.dto.UserResDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User convertToTeacher(UserReqDto userDto) {
        Teacher teacher = new Teacher();
        teacher.setName(userDto.getName());
        teacher.setEmail(userDto.getEmail());
        teacher.setPassword(userDto.getPassword());
        teacher.setPhone(userDto.getTeacher().getPhone());
        teacher.setExperiences(userDto.getTeacher().getExperiences());
        return teacher;
    }

    public User convertToStudent(UserReqDto userReqDto) {
        Student student = new Student();
        student.setName(userReqDto.getName());
        student.setEmail(userReqDto.getEmail());
        student.setPassword(userReqDto.getPassword());
        student.setYear(userReqDto.getStudent().getYear());
        return student;
    }

    public UserResDto convertToUserResDto(User user) {
        UserResDto userResDto = new UserResDto();
        userResDto.setName(user.getName());
        userResDto.setEmail(user.getEmail());
        return userResDto;
    }

}
