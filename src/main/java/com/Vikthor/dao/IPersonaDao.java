package com.Vikthor.dao;

import com.Vikthor.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Long> {
    
    
    
}
