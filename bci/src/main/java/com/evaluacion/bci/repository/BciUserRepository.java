package com.evaluacion.bci.repository;
import com.evaluacion.bci.dto.UserRequestOutDTO;
import com.evaluacion.bci.models.BciUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface BciUserRepository extends JpaRepository<BciUser, UUID> {

    @Query("SELECT B.id , B.created , B.modified , B.last_login , B.isactive FROM BciUser B WHERE B.email = :email")
     List<UserRequestOutDTO> findByEmail(String email) ;


}
