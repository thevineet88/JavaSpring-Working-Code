package com.app.employee.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.employee.employee.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

}
