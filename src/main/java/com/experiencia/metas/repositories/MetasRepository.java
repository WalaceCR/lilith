package com.experiencia.metas.repositories;

import com.experiencia.metas.entities.Metas;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MetasRepository extends JpaRepository<Metas, Long>{

}
