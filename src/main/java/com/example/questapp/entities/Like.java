package com.example.questapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="p_like")
@Data
public class Like {
    @Id
    Long id;

    @ManyToOne(fetch = FetchType.LAZY) //One post can have multiple likes.
    @JoinColumn(name = "post_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //When post is deleted likes also will be deleted.
    @JsonIgnore
    Post post;

    @ManyToOne(fetch = FetchType.LAZY) //One user can have multiple likes.
    @JoinColumn(name = "user_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //When account is deleted likes also will be deleted.
    @JsonIgnore
    User user;
}