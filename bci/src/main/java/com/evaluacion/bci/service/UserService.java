package com.evaluacion.bci.service;

import com.evaluacion.bci.dto.UserRequestEntryDTO;
import com.evaluacion.bci.dto.UserRequestOutDTO;
import com.evaluacion.bci.models.BciUser;
import com.evaluacion.bci.repository.PhonesRepository;
import com.evaluacion.bci.repository.BciUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;



@Service
public class UserService {

    @Autowired
    BciUserRepository bciUserRepository;

    @Autowired
    PhonesRepository phonesRepository;

    private ModelMapper modelMapper;


    public UserRequestOutDTO saveUser(UserRequestEntryDTO userRequestEntryDTO)  {

        BciUser bciUser = new BciUser();
        Date d1 = new Date();
        bciUser.setName(userRequestEntryDTO.getName());
        bciUser.setEmail(userRequestEntryDTO.getEmail());
        bciUser.setPassword(userRequestEntryDTO.getPassword());
        bciUser.setCreated(d1);
        bciUser.setModified(d1);
        bciUser.setLast_login(d1);
        bciUser.setIsactive(true);
        bciUser.setBciUserPhone(userRequestEntryDTO.getPhones());
        bciUserRepository.save(bciUser);


        List<UserRequestOutDTO> userRequestOutDTOList = bciUserRepository.SearchByEmail(userRequestEntryDTO.getEmail());

        UserRequestOutDTO userRequestOutDTO = new UserRequestOutDTO();

        return userRequestOutDTOList.get(0);


    }


}

