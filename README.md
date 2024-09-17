# Unravel WebApp Backend System

This project is a solution to the **Unravel WebApp Challenge**. It focuses on enhancing a backend system to be more robust and scalable under concurrent usage. The following are the primary tasks addressed in this project:

## Table of Contents
1. [Overview](#overview)
2. [Requirements](#requirements)
3. [Technologies Used](#technologies-used)
4. [How to Run](#how-to-run)
5. [Problem-Specific Implementations](#problem-specific-implementations)
6. [Contact](#contact)

## Overview
The project improves a backend system by addressing issues related to concurrency, memory management, deadlocks, and database connection pooling.

## Requirements
- Java 8+
- Maven
- MySQL
- HikariCP (Connection Pooling)

## Technologies Used
- **Java**: Core language for implementation.
- **Spring Framework**: For dependency injection and database connectivity.
- **HikariCP**: For efficient database connection pooling.
- **Concurrent Utilities**: To solve concurrency issues.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/unravel-webapp-backend.git

Navigate to the project directory:
cd unravel-webapp-backend

Install dependencies using Maven:mvn clean install

Configure the database:

spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=dbuser
spring.datasource.password=dbpassword

You can run the project using Maven:-  mvn spring-boot:run
