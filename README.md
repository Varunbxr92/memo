# Demo Project Memo For the assessment purpose
Assessment to create CRUD application for Notes

The tech stack for this one is 
## Java 21 and Spring boot 
with In memory storage for CRUD API to manage notes, Since i had constraint on this laptop of mine that i couldn't install npm and python libraries i had to opt for Java (Which anywhich way is my current tech stack in my ongoing project).

---
## Features

 - ** In- Memory storage ** (No Database Required)
 - ** CRUD Operations **: Create, Read, Update, Delete notes operations possible
 - ** Input Validations **: Implemented Input validation with error message
 - ** Global Exception handling **: for graceful error handlgin error responses.
 - ** Minimal Setup ** : Just Java 21 and Maven is required to be installed on the system.


---   
 ## Getting started : 

 ### Prerequisites

   - Java 21
   - Maven

### Setup and Run the application:

  - In your bash/ terminal clone the repository

    git clone https://github.com/Varunbxr92/memo.git

    Navigate to the Project directory by executing the command

    cd memo

- Build the Project by running this command:
  
  mvn clean install

After Build Success Message.

  - Run the application by executing the below given command

    mvn spring-boot:run

    By Default if your port 8080 is free then the application will run on this port, else you got to free up the port 8080

    The API Calls will be available at http://localhost:8080/notes
    
 ## API Endpoints


  

