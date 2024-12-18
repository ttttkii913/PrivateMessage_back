package org.privatemessage.api;

import lombok.RequiredArgsConstructor;
import org.privatemessage.api.dto.request.UserReqDto;
import org.privatemessage.api.dto.response.UserResDto;
import org.privatemessage.application.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/nickname")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UserResDto> saveNickname(@RequestBody UserReqDto userReqDto) {
        UserResDto userResDto = userService.saveNickname(userReqDto);
        return ResponseEntity.ok(userResDto);
    }

    @GetMapping("/nickname/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<UserResDto> findOne(@PathVariable Long id) {
        UserResDto userResDto = userService.findById(id);
        return ResponseEntity.ok(userResDto);
    }
}
