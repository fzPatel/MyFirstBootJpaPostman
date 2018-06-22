package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface DataRepo extends CrudRepository<Data, String>
{

}
