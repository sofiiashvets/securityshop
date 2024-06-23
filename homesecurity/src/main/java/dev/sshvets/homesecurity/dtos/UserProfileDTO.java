package dev.sshvets.homesecurity.dtos;

import lombok.Data;

@Data
public class UserProfileDTO {
    private Long id;
    private String username;
    private String email;
    private String address;
    private String phoneNumber;
}