package com.example.Controller;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Data;

public interface DataRepo extends CrudRepository<Data, String>
{

}
