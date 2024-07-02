package com.kaiquesilva.appfinancial.domain.repositories;

import com.kaiquesilva.appfinancial.domain.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
