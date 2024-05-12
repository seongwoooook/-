package bibim.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestApi {
    @GetMapping("/test")
    public String test(){
        return "2주차 세션 테스트 API입니다.";
    }

    @GetMapping("/test/json")
    public ApiResponse testJson(){
        return ApiResponse.create("2주차 세션 Json 테스트 API입니다");
    }
}
