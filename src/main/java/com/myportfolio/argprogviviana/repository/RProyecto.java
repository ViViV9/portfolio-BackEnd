package com.myportfolio.argprogviviana.repository;

import com.myportfolio.argprogviviana.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer> {
}
