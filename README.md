# ISH Project (Microservices Architecture)

## Overview
The **ISH Project** is a distributed enterprise application built using a Microservices Architecture. It provides an end-to-end workflow for citizen/user application processing, benefit eligibility determination, correspondence, and system management.

The architecture integrates multiple decoupled microservices with a shared MySQL database layer and communicates with external federal systems via RESTful web services.

---

## Architecture & Microservices

- **MS#1 Admin**: Core administrative services and platform configuration.
- **MS#2 Data Collection**: Handles intake of applicant and household data.
- **MS#3 Benefit Insurance**: Manages benefit schemes and insurance policies.
- **MS#4 Application Registration**: Entry point for application filings; integrates directly via REST API calls with external Federal Govt SSA-web services.
- **MS#5 Eligibility Determination**: Rules engine evaluating eligibility criteria based on collected data.
- **MS#6 Correspondence**: Generates and manages user notifications and communications.
- **MS#7 User Management**: Handles user authentication, authorization, and roles.
- **MS#8 Reports**: Aggregates metrics and generates operational analytics.

---

## System Integration & Tech Stack

- **Backend**: Java / Spring Boot / Spring Cloud Microservices
- **Database**: MySQL Database
- **External Integration**: Federal Govt USA SSA-web (REST API)
- **Frontend**: User Interface (Web / Single Page Application)
