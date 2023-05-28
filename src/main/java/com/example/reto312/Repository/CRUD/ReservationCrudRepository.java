package com.example.reto312.Repository.CRUD;

import com.example.reto312.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}