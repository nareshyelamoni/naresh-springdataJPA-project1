# 🚀 Spring Boot Employee Management (Spring Data JPA)

This project is a simple Spring Boot application that demonstrates how to perform database operations using **Spring Data JPA** with **MySQL**. It focuses on mapping Java objects to database tables and performing CRUD operations efficiently.

---

## 📌 Features

* Create and store Employee records
* Uses Spring Data JPA (`CrudRepository`)
* Entity mapping with JPA annotations
* MySQL database integration
* Automatic data insertion using `CommandLineRunner`

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven

---

## 📂 Project Structure

```
src/main/java/com/telusko
│── model       → Employee entity class  
│── repo        → Repository interface  
│── DataJpa1    → CommandLineRunner for testing  
│── Application → Main class  
```

---

## ⚙️ Configuration

Update your `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3307/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
```

---

## ▶️ How to Run

1. Clone the repository
2. Configure MySQL database
3. Run the main class
4. Check database for inserted Employee record

---

## 💡 Learning Outcomes

* Understanding of JPA annotations (`@Entity`, `@Id`, `@Column`)
* Working with Spring Data JPA repositories
* Basics of ORM (Object Relational Mapping)
* Spring Boot database integration

---

## 📌 Future Enhancements

* Add REST APIs (Controller layer)
* Implement Service layer
* Add update & delete operations
* Integrate frontend (Full Stack)

---

✨ This project is ideal for beginners learning Spring Boot and backend development.
