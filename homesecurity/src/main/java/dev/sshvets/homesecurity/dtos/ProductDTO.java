package dev.sshvets.homesecurity.dtos;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
    private Long categoryId;
}