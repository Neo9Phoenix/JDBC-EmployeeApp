# JDBC-EmployeeApp

A Java application that connects to a MySQL database and retrieves employee data using JDBC.

---

## Project Description

This project demonstrates how to use Java Database Connectivity (JDBC) to connect to a MySQL database, execute a query, and display the results. The app queries an `Employees` table and prints employee details.

---

## Technologies Used

- Java  
- JDBC  
- MySQL

---

## Folder Structure
```
JDBC-EmployeeApp/
├── src/
│   └── employeeapp/
│       └── JDBCConnect.java
├── .gitignore
├── LICENSE
└── README.md
```
---

## How to Compile and Run

1. Download the MySQL JDBC driver (Connector/J) from the [official site](https://dev.mysql.com/downloads/connector/j/).

2. Compile the Java code:

   ```bash
   javac -cp ".;path/to/mysql-connector-java-8.0.xx.jar" src/employeeapp/JDBCConnect.java
   ```

3. Run the Java program:

   ```bash
   java -cp ".;path/to/mysql-connector-java-8.0.xx.jar;src" employeeapp.JDBCConnect
   ```

> Replace `path/to/mysql-connector-java-8.0.xx.jar` with the **actual path** to your JDBC driver JAR file.
---

## Sample Output

```
ID   Name                 Position
--------------------------------------------
1    Alice Smith          Engineer
2    Bob Johnson          Manager
```

---

## License

This project is licensed under the MIT License.




