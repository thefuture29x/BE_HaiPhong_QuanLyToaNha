package com.example.be_haiphong_quanlytoanha.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBaseService <D,L>{
    List<D> findAll();

    Page<D> findAll(Pageable page);

    D findById(L id);

    D add(D dto);

    D update(D dto);

    boolean deleteById(L id);

    boolean deleteByIds(List<L> id);
}