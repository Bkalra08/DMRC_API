package com.Apidmrc.DMRC_API.Repositories;


import com.Apidmrc.DMRC_API.Entities.PassengerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Details extends JpaRepository<PassengerDetails, Integer> {
}
