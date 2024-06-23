package dev.sshvets.homesecurity.dtos;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private String customerName;
    private String customerEmail;
    private Long userId;
    private Long statusId;
    private List<OrderItemDTO> orderItems;
}