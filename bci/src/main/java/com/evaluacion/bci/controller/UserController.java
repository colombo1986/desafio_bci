package com.evaluacion.bci.controller;
import com.evaluacion.bci.dto.UserRequestEntryDTO;
import com.evaluacion.bci.dto.UserRequestOutDTO;
import com.evaluacion.bci.repository.BciUserRepository;
import com.evaluacion.bci.service.UserService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class UserController {

    @Autowired
    private UserService userService ;

   @Autowired
   private BciUserRepository bciUserRepository ;


    @ResponseBody
    @PostMapping("/saveuser")
    public ResponseEntity <UserRequestOutDTO> bciUser (@Valid @RequestBody UserRequestEntryDTO userRequestEntryDTO ) throws Exception {

            String existEmail = bciUserRepository.ReturnByEmail(userRequestEntryDTO.getEmail()) ;

            if(existEmail !=null){
                throw new RuntimeException("Usuario ya existe") ;
            }


            return ResponseEntity.ok().body(userService.saveUser(userRequestEntryDTO));

 }





}
