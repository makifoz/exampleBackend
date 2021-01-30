package com.example.Bit.dao;

import com.example.Bit.entity.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyEntityDAO extends JpaRepository<DummyEntity,Long> {
}
