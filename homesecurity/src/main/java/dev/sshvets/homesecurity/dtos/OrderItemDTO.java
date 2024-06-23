package dev.sshvets.homesecurity.dtos;

import lombok.Data;

@Data
public class OrderItemDTO {
    private Long orderId;
    private Long productId;
    private Integer quantity;
}