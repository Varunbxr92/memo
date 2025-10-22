# Demo Project Memo For the assessment purpose
Assessment to create CRUD application for Notes

The tech stack for this one is 
## Java 21 and Spring boot 
### In memory storage for CRUD API to manage notes, Since i had constraint on this laptop of mine that i couldn't install npm and python libraries i had to opt for Java (Which anywhich way is my current tech stack in my ongoing project).

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
| Method	| Endpoint	| Description |
|:------:| :-------:| :----------:|
| POST	  |  ‘ /notes ’ |  	Create a New Note |
| GET	   | ‘ /notes ’	 | Retrieve All Notes |
| GET	  |  ‘ /notes/{id}’ |  	Retrieve a Note By Id |
| PUT	   | ‘ /notes/{id} ’	 | Update a Note By Id |
| DELETE	 |  ‘ /notes/{id} ’ |  	Delete a Note By Id |	


## Example Requests: 

  ### Create a Note

   ```shell
   curl --location 'http://localhost:8080/notes' \
--header 'Content-Type: application/json' \
--data '{
    "title" : "Test3",
    "content": "Test Content3"
}'
```

### Get All Notes
```shell
curl --location 'http://localhost:8080/notes'
```

### Get Note By Id
```shell
curl --location 'http://localhost:8080/notes'/1
```

### Update a Note
```shell
curl --location --request PUT 'http://localhost:8080/notes/3' \
--header 'Content-Type: application/json' \
--data '{
    "title": "Updated Title for 3",
    "content": "This is valid content for 3"
}'
```

### Delete a Note By Id
```shell
curl --location --request DELETE 'http://localhost:8080/notes/3'
```

## Error Handling 
 All errors are returned as structured JSON with Appropriate error codes.
 ### Validation Error (400)
```json
 {
  "title": "Title is mandatory",
  "content": "Content is Mandatory"
 }
```

 ### Not Found Error (404)
```json
 {
  "error": "Note Not Found with id : 1"
 }
```

 ### Internal Server Error (500)
```json
 {
  "error": "An unexpected error occurred: <error message>"
 }
```

-- Data will leave the memory as soon as the application comes to halt.
-- No database required since we are opting for In memory, here i have used List data structure in order to save the data

## Video Demo

 ### I have added Video Demo of the application Project Running fine locally on system and apparently can be seen from here.
  --- https://drive.google.com/drive/folders/1RFgBrrAWH9ovMN8_WhUzDxyNQihTdlQe?usp=sharing

  


