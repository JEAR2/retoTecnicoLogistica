package com.reto.pruebalogistica.repositories;

import com.reto.pruebalogistica.entities.LogisticaCamiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticaCamionesRepository extends JpaRepository<LogisticaCamiones,Long> {
}
