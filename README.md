# Java Spring Boot Microservice Assignment

## Introduction

This repository contains a Java Spring Boot microservice designed to meet the requirements for the Java Developer internship assignment. The application handles the creation and retrieval of nodes, including validation for null values and disallowing special characters.

## Setup Instructions

1. **Clone the Repository**

   ```bash
   git clone https://github.com/mani818686/Java-Developer-Assignment.git
   cd Java-Developer-Assignment
2. **Build the Project**

   ```bash
   mvn clean install
2. **Run the Application**

   ```bash
   mvn spring-boot:run


## Endpoints

### 1. POST /api/nodes

- **Description:** Create a new node.
- **Endpoint:** `/api/nodes`
- **Method:** POST
- **Request Body:**

  ```json
  {
    "name": "string",
    "description": "string",
    ....more fields
  }

### 2. GET /api/nodes

- **Description:** Get all Nodes.
- **Endpoint:** `/api/nodes`
- **Method:** GET
