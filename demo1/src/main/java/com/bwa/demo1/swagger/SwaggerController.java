package com.bwa.demo1.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@Api(value = "PersonCarController",tags= "测试")
@RequestMapping("/person")
@TestAnno
public class SwaggerController {

    @ApiOperation(value = "获取用户信息",notes = "用户列表")
    @GetMapping(value = "/test")
    public List<String> testSwagger(@RequestParam String id){
        List<String> list  = new ArrayList<>();
        return list;
    }

    @ApiOperation(value = "修改用户信息")
    @PostMapping(value = "/test2")
    public List<User> testSwagger12(@ModelAttribute @RequestBody User user){
        List<User> list  = new ArrayList<>();
        list.add(user);
        return list;
    }

    @PutMapping("/{id}")
    @ApiOperation("根据id更新用户的接口")
    public User updateUserById(@RequestBody User user) {
        user.setAge("12");
        user.setName("kert12");
        return user;
    }
}
