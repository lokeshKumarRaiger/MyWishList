# MyWishList
MyWishlist
Overview
MyWishlist is a Spring Boot application designed to allow users to create and manage their personal wishlists of products. Each user has a dedicated wishlist, where they can add and organize their desired products. The application utilizes the H2 database for a seamless, in-memory data storage experience.

Features
User Management: Create and manage user accounts.
Product Management: Add and list available products.
Wishlist Management: Users can create personalized wishlists by adding products.
H2 Database: In-memory database integration for quick and easy setup.
Technology Stack
Java (Spring Boot)
H2 Database (In-memory database)
Spring Data JPA (Object-Relational Mapping)
Maven (Dependency Management)
Project Structure
css
Copy code
src/
│
├── main/
│   ├── java/
│   │   └── com.example.mywishlist/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       ├── application.properties
│       └── data.sql
└── test/
Setup and Run
Clone the Repository

bash
Copy code
git clone https://github.com/your-username/MyWishlist.git
cd MyWishlist
Run the Application Run the following Maven command to start the application:

bash
Copy code
mvn spring-boot:run
Access the Application Once started, you can access the application at:

arduino
Copy code
http://localhost:8080
Database Configuration (H2)
The application uses H2 as an in-memory database. You can access the H2 console for testing by visiting:

bash
Copy code
http://localhost:8080/h2-console
The default H2 configurations are in the application.properties file.
