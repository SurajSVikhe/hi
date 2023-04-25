package com.srj.IRCTCResourcesApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srj.IRCTCResourcesApp.model.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

}
