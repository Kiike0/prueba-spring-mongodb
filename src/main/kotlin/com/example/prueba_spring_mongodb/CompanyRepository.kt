package com.example.prueba_spring_mongodb

import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String>

