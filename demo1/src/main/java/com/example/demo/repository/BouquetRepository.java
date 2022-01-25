package com.example.demo.repository;

import com.example.demo.model.Bouquet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface BouquetRepository extends JpaRepository<Bouquet,Integer> {

 //   Bouquet save(Bouquet bouquet);

}
