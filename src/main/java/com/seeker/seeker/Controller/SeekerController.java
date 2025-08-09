package com.seeker.seeker.Controller;

import com.seeker.seeker.DTO.SeekerDTO;
import com.seeker.seeker.Service.SeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class SeekerController {
    @Autowired
    private SeekerService seekerService;

    @PostMapping("/register")
    public ResponseEntity<SeekerDTO> register(
            @RequestParam String fullName,
            @RequestParam String email,
            @RequestParam String nic,
            @RequestParam String qualificationLevel,
            @RequestParam MultipartFile document
    ) {
        SeekerDTO seekerdto = new SeekerDTO(fullName, email, nic, qualificationLevel, document);
        seekerService.registerSeeker(seekerdto);
    return new ResponseEntity<SeekerDTO>(seekerdto,HttpStatus.OK);
    }
}


