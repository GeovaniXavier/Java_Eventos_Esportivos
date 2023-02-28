package com.geovani.eventoesportivo.repository;

import com.geovani.eventoesportivo.dto.InscricaoDto;
import com.geovani.eventoesportivo.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {

}
