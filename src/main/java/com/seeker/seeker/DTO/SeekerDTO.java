package com.seeker.seeker.DTO;



import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SeekerDTO {
    private String fullName;
    private String email;
    private String nic;
    private String qualificationLevel;
    private MultipartFile document;
}

