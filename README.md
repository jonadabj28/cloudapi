# Cloud API - Spring Boot REST Backend

A RESTful backend API built with Spring Boot.

## Features
- Create file records
- Get all file records
- Get file by ID
- Update file
- Delete file
- Uses H2 in-memory database
- JPA + Hibernate
- Clean layered architecture (Controller, Service, Repository)

## Tech Stack
- Java 17
- Spring Boot 4
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

POST /api/files
GET /api/files
GET /api/files/{id}
PUT /api/files/{id}
DELETE /api/files/{id}

## How to Run

./mvnw spring-boot:run

Runs on:
http://localhost:8080
