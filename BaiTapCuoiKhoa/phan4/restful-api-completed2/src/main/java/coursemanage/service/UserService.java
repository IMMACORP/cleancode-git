package coursemanage.service;

import coursemanage.dto.UserReqDto;
import coursemanage.dto.UserResDto;
import coursemanage.entity.User;
import coursemanage.entity.UserFactory;
import coursemanage.entity.UserMapper;
import coursemanage.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserFactory userFactory;

    private final UserMapper userMapper;

    @Transactional(readOnly = true)
    public User findUserByEmail(String email) {
        return (User) userRepository.findByEmail(email);
    }

    @Transactional
    public UserResDto saveUser(UserReqDto userReqDto) {
        User user = userFactory.createUser(userReqDto);
        User createdUser = userRepository.save(user);
        return userMapper.convertToUserResDto(createdUser);

    }


}
