package org.privatemessage.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@RequiredArgsConstructor
public class User {
    @Id @GeneratedValue
    private Long id;

    private String nickname;

    @Builder
    public User(String nickname) {
        this.nickname = nickname;
    }
}
