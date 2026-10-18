# Spring Boot Backend Workshop
# Workshop Management API

REST API for managing automotive workshop operations, developed with Java and Spring Boot.

**Project status:** IN DEVELOPMENT

## About the project

This project aims to provide a backend solution for managing the main operations of an automotive workshop, including customers, vehicles, appointments, mechanics and workshops.

The application is being developed following a layered architecture inspired by **Hexagonal Architecture**, with a focus on separation of concerns, maintainability and good software design practices.

## Technologies

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MariaDB**
- **Maven**
- **Git & GitHub**

## Main features

The following features are planned or under development:

- Customer management.
- Vehicle management and customer-vehicle relationships.
- Appointment management.
- Workshop and mechanic management.
- Relational database persistence using JPA/Hibernate.
- REST endpoints for managing workshop operations.

## Architecture

The project follows a structure inspired by Hexagonal Architecture to separate business logic from infrastructure concerns.

The main packages include:

- `domain`: Core business models and domain logic.
- `application`: Application services, DTOs and ports.
- `infrastructure`: REST controllers, persistence adapters and database integration.

## Project status

The project is currently under development. Features, API endpoints, validation and testing will be added progressively.

## Getting started

Prerequisites:

- Java JDK
- Maven (or the included Maven Wrapper)
- Docker and Docker Compose
- MariaDB

Setup and execution instructions will be added as the application configuration is completed.

Developed as a personal project to strengthen my backend development skills with Java, Spring Boot, relational databases and software architecture.
