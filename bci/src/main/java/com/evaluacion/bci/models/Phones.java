package com.evaluacion.bci.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Transactional
@Data
@Table(name = "BCIUSERSPHONES")
public class Phones {

    @Id
    @GeneratedValue
    @Column(name = "ID" , columnDefinition = "UUID")
    private UUID id ;

    @NotNull
    @Column(name = "NUMBER")
    @JsonProperty("number")
    private String number ;

    @NotNull
    @Column(name = "CITYCODE")
    @JsonProperty("citycode")
    private String citycode ;

    @NotNull
    @Column(name = "COUNTRYCODE")
    @JsonProperty("contrycode")
    private String countrycode ;


    public Phones() {
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }


}
