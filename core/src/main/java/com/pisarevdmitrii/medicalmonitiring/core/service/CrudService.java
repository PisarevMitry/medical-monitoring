package com.pisarevdmitrii.medicalmonitiring.core.service;

import java.util.List;

public interface CrudService<T> {

    T findById(Long id);

    List<T> findAll();

    T save(T entity);

    T deleteById(Long id);

}