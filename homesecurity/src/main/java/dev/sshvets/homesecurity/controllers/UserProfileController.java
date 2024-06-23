package dev.sshvets.homesecurity.controllers;

import dev.sshvets.homesecurity.dtos.UserProfileDTO;
import dev.sshvets.homesecurity.services.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "http://localhost:4200")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping
    public UserProfileDTO getUserProfile() {
//        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return userProfileService.getUserProfile("admin");
    }

    @PutMapping
    public UserProfileDTO updateUserProfile(@RequestBody UserProfileDTO userProfileDTO) {
        return userProfileService.saveUserProfile(userProfileDTO);
    }
}