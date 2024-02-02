package com.example.prueba_spring_mongodb

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("companies")
data class Company(
    @Id
    val id: String? = null,
    var name: String,
    var countryLocation: String,
    var yearFounded: String,
    @Field("company_address")
    var address: String
)

/**
 * Se puede modificar la clase a tu antojo que igualmente se añadirán los datos a la base
 * de datos nosql, esa es la ventaja de usar mongodb
 * Para esto tenemos que añadir más atributos a esta clase por ejemplo y enviarlo desde el
 * postman o desde estemos manejando los datos
 */
