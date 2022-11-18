package com.evaluacion.bci.repository;

import com.evaluacion.bci.models.Phones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PhonesRepository extends JpaRepository<Phones, UUID> {


}
