package com.xicola.xicola.repository;

import com.xicola.xicola.model.TipoRelatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TipoRelatorioRepository extends JpaRepository<TipoRelatorio, Long> {


}
