package com.example.prueba_spring_mongodb

class CompanyResponse(
    val id: String,
    val name: String,
    val address: String,
    val countryLocation: String,
    val yearFounded: String,
) {
    companion object {
        fun fromEntity(company: Company): CompanyResponse =
            CompanyResponse(
                id = company.id!!,
                name = company.name,
                address = company.address,
                countryLocation = company.countryLocation,
                yearFounded = company.yearFounded
            )
    }
}