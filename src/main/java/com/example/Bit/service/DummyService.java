package com.example.Bit.service;

import com.example.Bit.dao.DummyEntityDAO;
import com.example.Bit.entity.DummyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class DummyService  implements IService{
    @Autowired
    private DummyEntityDAO dummyEntityDAO;

    @Override
    public Page<DummyEntity> getAll(Integer pageNo, Integer pageSize){

        Page<DummyEntity> pagedResult = dummyEntityDAO.findAll(PageRequest.of(pageNo,pageSize));

        return pagedResult;
    }
}
