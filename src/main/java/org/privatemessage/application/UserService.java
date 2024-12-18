package org.privatemessage.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.privatemessage.api.dto.request.UserReqDto;
import org.privatemessage.api.dto.response.UserResDto;
import org.privatemessage.domain.Repository.UserRepository;
import org.privatemessage.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    

    public UserResDto saveNickname(UserReqDto userReqDto) {
        User user = User.builder()
                .nickname(userReqDto.nickname())
                .build();
        user = userRepository.save(user);


        return UserResDto.from(user);
    }
}
