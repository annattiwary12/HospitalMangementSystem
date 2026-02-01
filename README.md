# 🏥 Hospital Management System (Spring Boot)

A backend Hospital Management System built using Spring Boot, Spring Data JPA, Hibernate, and PostgreSQL.  
This system manages Patients, Doctors, Appointments, Departments, and Insurance with proper entity relationships and DTO-based projections.

---

## 🚀 Features

- Manage Patients, Doctors, Departments, Appointments, and Insurance  
- One-to-Many, Many-to-One, and Many-to-Many relationships  
- DTO & Interface-based Projections  
- Custom JPQL Queries  
- Pagination, Sorting & Filtering support  
- Validation using Hibernate Validator  
- PostgreSQL Database Integration  
- RESTful API Architecture  

---

## 🛠 Tech Stack

- Java 21  
- Spring Boot  
- Spring Data JPA  
- Hibernate ORM  
- PostgreSQL  
- Lombok  
- Gradle  

---

## 📂 Project Structure

- src/main/java/com/backend/hospitalManagementSystem
- │
- ├── dto
- │ ├── BloodGroupStats.java
- │ ├── CPatientInfo.java
- │ └── IPatientInfo.java
- │
- ├── entities
- │ ├── Appointment.java
- │ ├── Department.java
- │ ├── Doctor.java
- │ ├── Insurance.java
- │ ├── Patient.java
- │ └── types
- │ └── BloodGroupType.java
- │
- ├── repositories
- │ └── PatientRepository.java
- │
- ├── services
- │ └── PatientServices.java
- │
- └── HospitalManagementSystemApplication.java

-----

📌 Future Enhancements

- Authentication & Authorization (JWT)

- Role Based Access (Admin, Doctor, Patient)

- Swagger API Documentation

- Docker Support

- Frontend Integration (React / Angular)

-----
👨‍💻 Author

Anant Tiwary
GitHub: https://github.com/annattiwary12
---
<img width="917" height="797" alt="image" src="https://github.com/user-attachments/assets/5ec0d3a2-11bb-4ac7-9fe5-915ec543b1ef" />

