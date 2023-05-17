package com.reto.pruebalogistica.repositories;

import com.reto.pruebalogistica.entities.Puerto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuertoRepository extends JpaRepository<Puerto,Long> {
}
