package com.xicola.xicola.repository;

import com.xicola.xicola.model.RelatorioFinanceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioFinanceiroRepository extends JpaRepository<RelatorioFinanceiro, Integer> {


}
