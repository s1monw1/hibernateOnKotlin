package com.kotlinexpertise.hibernatedemo.repository

import com.kotlinexpertise.hibernatedemo.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {
    fun getByAddressStreet(street: String): Person?
}