package org.privatemessage.api.dto.request;

import lombok.Builder;

@Builder
public record UserReqDto(
        String nickname
) {
}
