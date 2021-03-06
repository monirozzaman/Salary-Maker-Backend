package com.technical.salarymakerbackend.domain.repository;

import com.technical.salarymakerbackend.domain.model.Bank;
import com.technical.salarymakerbackend.domain.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank,String> {
}
