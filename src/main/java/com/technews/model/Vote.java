package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")
public class Vote {}

public class Vote {
    private Integer id;
    private Integer userId;
    private Integer postId;
}
