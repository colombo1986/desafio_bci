package com.evaluacion.bci.controller;
import com.evaluacion.bci.dto.UserRequestEntryDTO;
import com.evaluacion.bci.dto.UserRequestOutDTO;
import com.evaluacion.bci.repository.BciUserRepository;
import com.evaluacion.bci.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService ;

   @Autowired
   private BciUserRepository bciUserRepository ;


    @ResponseBody
    @PostMapping("/saveuser")
    public ResponseEntity <UserRequestOutDTO> bciUser (@RequestBody UserRequestEntryDTO userRequestEntryDTO){

        return ResponseEntity.ok().body(userService.saveUser(userRequestEntryDTO));

 }





}
