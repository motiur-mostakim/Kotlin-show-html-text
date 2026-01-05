package com.example.hellow_world

data class Person(
    val id: Int,
    val name: String,
    val email: String,
)

val personList = listOf<Person>(
    Person(id = 1, name = "Motiur", email = "motiur@gmail.com"),
    Person(id = 2, name = "Mostakim", email = "mostakim@gmail.com"),
    Person(id = 3, name = "MRM", email = "mrm@gmail.com"),
    Person(id = 4, name = "Motiur-Mostakim", email = "motiurmostakim@gmail.com"),
    Person(id = 5, name = "Mostakim Ben Ab. Rahman", email = "mrbenabrahman@gmail.com"),
    Person(id = 6, name = "Sojib", email = "sojib@gmail.com"),
    Person(id = 7, name = "Shakil", email = "shakil@gmail.com"),
    Person(id = 8, name = "Mithu", email = "mithu@gmail.com"),
    Person(id = 9, name = "Riaz", email = "riaz@gmail.com"),
    Person(id = 10, name = "Anik", email = "anik@gmail.com"),
    Person(id = 11, name = "Hassan", email = "hassan@gmail.com"),
    Person(id = 12, name = "Abdullah", email = "abdullah@gmail.com"),
    Person(id = 13, name = "Ahnaf", email = "ahnaf@gmail.com"),
    Person(id = 14, name = "Hossain", email = "hossain@gmail.com"),
    Person(id = 15, name = "Rafi", email = "rafi@gmail.com"),
)