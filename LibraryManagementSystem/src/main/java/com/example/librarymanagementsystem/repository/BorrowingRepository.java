package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.model.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
}
