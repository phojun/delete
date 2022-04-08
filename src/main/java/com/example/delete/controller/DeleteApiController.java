package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public String delete(@RequestBody @PathVariable String userId, @RequestParam String account) {
        System.out.println(userId);
        System.out.println(account);

        return userId + " : " + account + " delete success";
    }
}
