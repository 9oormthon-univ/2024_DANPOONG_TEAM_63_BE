package danpung.cheongpodo.controller;

import danpung.cheongpodo.repository.UserRepository;
import danpung.cheongpodo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/member/get") // Swagger Test용 임시 Controller 메소드
    public void getMember(){
        return ;
    }

}
