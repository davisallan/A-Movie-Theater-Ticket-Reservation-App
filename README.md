# Movie Theater Ticket Reservation App

# About
Final project in ENSF619 - Special Topics. The project was split into two sections, Design and Implementation. 
Details on the design artifacts and details are listed below:

# Design Phase (40 marks)
In this phase you should submit a Design Document that includes a clear description of system’s requirements, and design artefacts in the following order:

- Systems use case diagram.
- Systems activity diagram
- A state transition diagram for the following objects in your system:
  - Model.Ticket object
  - Payment object
- A detailed “Scenario” each use case, having all candidate objects underlined, and all
candidate operations underlined (use single-underline for objects and double-underline for
operations).
- System interaction diagrams for four major and important use cases in this system (each
team member must take responsibility one and his/her name must appear on the related
page).
- A Design Level Class Specification that includes:
  - A class diagram without attributes and behavior that only shows the class name and the relationships among them. The purpose of this diagram is to show the entire system in one page. Please make sure lines never cross each other and the diagram is clear and easy to read.
   Note: You class diagram should be traceable into your use-case scenarios. Mark
   will be deducted for class that are not trace able in these documents.
  - A class diagram with no relationships (no lines), only showing the class details: attributes and behaviours.     This diagram can be organized in multiple pages. Please
  try to keep them well organized, clear, and easy to read.
  - A state transition diagram for at least two major and core classes in the system
- A Package Diagram
- A Deployment Diagram
Note: In this stage you need to apply all possible design strategies and techniques to make the architecture of the system more: reusable, scalable, maintainable, reliable, and using necessary concepts such as modular design, inheritance, realization, aggregation, composition, polymorphism, and appropriate design patterns as needed.

# Program Requirements
1. Java 11
2. MySQL Workbench
3. JDBC

# Program Demo
![](program_demo.gif)

# Running the Program
1. Clone the repository
2. Open and run the sql script "create-ReservationTicketApp.sql" located in "/Database Queries/" to create the schema
3. Open and run the sql script "Insertion Queries.sql" to populate the database
4. Run "MainController.java" located in "Project SourceCode/Controller/MainController.java" to launch the GUI
*Note: "Registered" User account info located in the registered_user table of the database
