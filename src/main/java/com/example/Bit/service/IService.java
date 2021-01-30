package com.example.Bit.service;

import com.example.Bit.entity.DummyEntity;
import org.springframework.data.domain.Page;

public interface IService {

    Page<DummyEntity> getAll(Integer pageNo, Integer pageSize);

}
