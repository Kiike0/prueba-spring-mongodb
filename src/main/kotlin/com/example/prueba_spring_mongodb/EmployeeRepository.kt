package com.example.prueba_spring_mongodb

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, ObjectId> {
    fun findByCompanyId(id: String): List<Employee>
}