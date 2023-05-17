package com.reto.pruebalogistica.repositories;

import com.reto.pruebalogistica.entities.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Long> {}
