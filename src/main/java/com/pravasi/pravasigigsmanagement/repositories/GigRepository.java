package com.pravasi.pravasigigsmanagement.repositories;

import com.pravasi.pravasigigsmanagement.model.Gig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GigRepository extends JpaRepository<Gig, Long> {

    List<Gig> findByUserId(long userId);
}
