package dev.sshvets.homesecurity.dtos;

import lombok.Data;

@Data
public class ReviewDTO {
    private Long id;
    private Integer rating;
    private String comment;
    private Long userId;
    private Long productId;
}
