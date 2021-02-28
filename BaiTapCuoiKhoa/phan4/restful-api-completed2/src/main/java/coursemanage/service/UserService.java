package coursemanage.service;

import coursemanage.dto.UserReqDto;
import coursemanage.dto.UserResDto;
import coursemanage.entity.Teacher;
import coursemanage.entity.User;
import coursemanage.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        User teacher;
        if (Objects.isNull(userReqDto.getId())) {
            teacher = new Teacher();
        } else {
            teacher = userRepository.findById(userReqDto.getId())
                    .orElseThrow(() -> new RuntimeException(String.format("User not found: #%s", userReqDto.getId())));
        }
        modelMapper.map(userReqDto, teacher);
        User savedUser = userRepository.save(teacher);
        return modelMapper.map(savedUser, UserResDto.class);
    }


}
