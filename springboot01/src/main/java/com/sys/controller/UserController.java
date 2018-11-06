package com.sys.controller;

import com.sys.controller.response.UserResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: YSY
 * Date: Created in 2018/10/30 17:39
 */
@RestController
@RequestMapping("user")
public class UserController {

    /*@Value("${http_url}")
    private String httpUrl;
*/
    @GetMapping("login")
    public ResponseEntity<List<UserResponse>> login() {
        List<UserResponse> arrayList = new ArrayList<UserResponse>();
        for (int i = 0; i < 10; i++) {
            UserResponse user = new UserResponse("zhangsan" + i, i + "", LocalDateTime.now());
            arrayList.add(user);
        }
        return ResponseEntity.ok(arrayList);
    }

    @GetMapping("/log")
    public String logTest(String name, String age) {

        return "success";
    }

    /**
     * 获取不同环境下的http_url
     * @return
     */
  /*  @GetMapping("/url")
    public String getUrl() {
        return httpUrl;
    }*/
}
