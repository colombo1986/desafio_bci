package com.evaluacion.bci.repository;
import com.evaluacion.bci.dto.UserRequestOutDTO;
import com.evaluacion.bci.models.BciUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface BciUserRepository extends JpaRepository<BciUser, UUID> {

    @Query("SELECT new com.evaluacion.bci.dto.UserRequestOutDTO" +
            "(user.id , user.created , user.modified , user.last_login , user.isactive) " +
            "FROM BciUser user Where user.email=:email ")
     List<UserRequestOutDTO> SearchByEmail(String email) ;

    @Query("SELECT b.email FROM BciUser b WHERE b.email = :email")
    String ReturnByEmail(String email) ;


}
