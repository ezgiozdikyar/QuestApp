package com.example.questapp.requests;

import lombok.Data;

@Data
public class CommentCreateRequest {
    Long id;
    Long postId;
    Long userId;
    String text;
}