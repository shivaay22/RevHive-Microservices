package com.revhive.post.dto.response;

import lombok.Data;

@Data
public class UserResponse {

    private Long userId;
    private String username;
    private String email;
}
