package dev.sshvets.homesecurity.services;


import dev.sshvets.homesecurity.dtos.UserProfileDTO;
import dev.sshvets.homesecurity.entities.UserProfile;
import dev.sshvets.homesecurity.repositories.UserProfileRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserProfileDTO getUserProfile(String username) {
        UserProfile userProfile = userProfileRepository.findByUserUsername(username);
        return modelMapper.map(userProfile, UserProfileDTO.class);
    }

    public UserProfileDTO saveUserProfile(UserProfileDTO userProfileDTO) {
        UserProfile userProfile = modelMapper.map(userProfileDTO, UserProfile.class);
        userProfile = userProfileRepository.save(userProfile);
        return modelMapper.map(userProfile, UserProfileDTO.class);
    }
}
