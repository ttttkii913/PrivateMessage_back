package org.privatemessage.api.dto.response;

import lombok.Builder;
import org.privatemessage.domain.User;

@Builder
public record UserResDto(
        Long id,
        String nickname
) {
    public static UserResDto from(User user) {
        return UserResDto.builder()
                .id(user.getId())
                .nickname(user.getNickname())
                .build();

    }
}
