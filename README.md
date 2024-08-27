# Landon Hotel Scheduling Application
This project is a modification of the Landon Hotel scheduling application. The enhancements include:

Multithreaded Language Translation: The application now supports English and French, displaying a welcome message in both languages using separate threads.
Currency Display: Prices for reservations are displayed in U.S. dollars (USD), Canadian dollars (CAD), and Euros (EUR).
Time Zone Conversion: The application converts and displays times across Eastern Time (ET), Mountain Time (MT), and Coordinated Universal Time (UTC) for scheduling live presentations.
Docker Containerization: The application is packaged into a Docker image, ready for deployment across various cloud environments.
This project demonstrates skills in full-stack development, internationalization, multithreading, and containerization. It’s a valuable addition to your portfolio, showcasing your ability to adapt and enhance existing applications to meet new business requirements.


## Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
   - [Multithreaded Language Translation](#multithreaded-language-translation)
   - [Currency Display](#currency-display)
   - [Time Zone Conversion](#time-zone-conversion)
   - [Docker Containerization](#docker-containerization)
3. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
   - [Running with Docker](#running-with-docker)
4. [Deployment](#deployment)
5. [Repository Structure](#repository-structure)
6. [Demo](#demo)


## Project Overview

This project is a modification of the Landon Hotel scheduling application. The application has been enhanced to meet the new business requirements set forth by the management. The modifications include multithreaded language translation, currency display in multiple formats, and time zone conversion for event scheduling. Additionally, the application has been containerized using Docker for easy deployment to cloud environments.

## Features

### 1. Multithreaded Language Translation
- **Welcome Message Translation:** The application now supports English and French, displaying a welcome message in both languages using separate threads.
- **Resource Bundles:** English and French resource bundles have been implemented to comply with Canadian language requirements.

### 2. Currency Display
- **Multiple Currencies:** Prices for reservations are now displayed in three different currencies: U.S. dollars (USD), Canadian dollars (CAD), and Euros (EUR).
- **Front-End Integration:** The Angular front end has been modified to accommodate these changes.

### 3. Time Zone Conversion
- **Time Zone Support:** The application includes functionality to convert and display times across Eastern Time (ET), Mountain Time (MT), and Coordinated Universal Time (UTC).
- **Live Presentation Scheduling:** This feature allows the application to display times for live presentations at the Landon Hotel in all three time zones.

### 4. Docker Containerization
- **Docker Image:** A Dockerfile has been created to package the application into a Docker image, making it easy to deploy across various environments.
- **Container Deployment:** The Docker image has been tested and is ready for deployment to cloud services.

## Getting Started

### Prerequisites
- **Java 8 or higher**
- **Angular CLI**
- **Maven**
- **Docker**

### Installation
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/david-delgado17/Multithreaded-Language-Translation.git
2. **Navigate to the Project Directory:**
   ```bash
   cd d387-advanced-java
3. **Install Dependencies:**
   ```bash
   mvn install
4. **Run the Application:**
    ```bash
    mvn spring-boot:run

    ### Running with Docker
1. **Build the Docker Image:**
   ```bash
   docker build -t landon-hotel-app .
2. **Run the Docker Container:**
  ```bash
  docker run -d -p 8080:8080 --name landon-hotel-app-container landon-hotel-app
  ```
## Deployment
To deploy this application to a cloud service:
1. **Select a Cloud Provider:** AWS, Google Cloud, or Azure.
2. **Push the Docker Image:** Push the Docker image to a container registry (e.g., Docker Hub, AWS ECR).
3. **Deploy to Cloud:** Use the cloud provider's container services (e.g., AWS ECS, Google Kubernetes Engine) to deploy the application.

## Demo

