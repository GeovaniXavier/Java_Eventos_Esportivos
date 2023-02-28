package com.geovani.eventoesportivo.repository;

import com.geovani.eventoesportivo.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

}
