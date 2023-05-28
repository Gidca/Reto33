package com.example.reto312.Repository.CRUD;

import com.example.reto312.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}