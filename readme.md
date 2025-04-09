[//]: # (Authentication APIs)

[//]: # ()
[//]: # (Register User: POST https://zynetic-book-applicationv1-1.onrender.com/auth/signup)

[//]: # (Login User: POST https://zynetic-book-applicationv1-1.onrender.com/auth/login)

[//]: # (Greeting Test: GET https://zynetic-book-applicationv1-1.onrender.com/auth/)

[//]: # ()
[//]: # (Book Management APIs)

[//]: # ()
[//]: # (Create Book: POST https://zynetic-book-applicationv1-1.onrender.com/api/book/book-register)

[//]: # (Get All Books: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/all-books)

[//]: # (Get Book by ID: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/{id})

[//]: # (Update Book: PUT https://zynetic-book-applicationv1-1.onrender.com/api/book/{id})

[//]: # (Delete Book: DELETE https://zynetic-book-applicationv1-1.onrender.com/api/book/{id})

[//]: # ()
[//]: # (Filtering APIs)

[//]: # ()
[//]: # (Filter by Author: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/filter/author?author={authorName})

[//]: # (Filter by Category: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/filter/category?category={categoryName})

[//]: # (Filter by Rating: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/filter/rating?rating={ratingValue})

[//]: # (Combined Filter: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/filter?author={authorName}&category={categoryName}&rating={ratingValue})

[//]: # ()
[//]: # (Search APIs)

[//]: # ()
[//]: # (Search by Name: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/search/name?keyword={searchTerm})

[//]: # (Search by Author with Sorting: GET https://zynetic-book-applicationv1-1.onrender.com/api/book/search/by-sorted-author?author={authorName}&sortBy={fieldName}&direction={asc|desc})

[//]: # ()
[//]: # ()
[//]: # ()
[//]: # (Zynetic Bookstore Application)

[//]: # (Live API: https://zynetic-book-applicationv1-1.onrender.com)

[//]: # (GitHub Repository: https://github.com/souptik23/Zynetic-Book-ApplicationV1.git)

[//]: # (Features)

[//]: # (Book Management: Create, retrieve, update, and delete books)

[//]: # (Advanced Search: Filter books by author, category, rating, or combined criteria)

[//]: # (Sorting: Sort results by various fields in ascending or descending order)

[//]: # (User Authentication: Secure signup and login with JWT token-based authentication)

[//]: # (Exception Handling: Robust error handling with appropriate HTTP status codes)

[//]: # (Technologies)

[//]: # (Backend: Spring Boot)

[//]: # (Security: Spring Security with JWT Authentication)

[//]: # (Database: MongoDB)

[//]: # (Build Tool: Maven)

[//]: # (Deployment: Render)

[//]: # (Getting Started)

[//]: # (Prerequisites)

[//]: # (Java 11 or higher)

[//]: # (Maven)

[//]: # (MongoDB)

[//]: # (Git)

[//]: # (Installation)

[//]: # (Clone the repository:)

[//]: # (bash)

[//]: # (git clone https://github.com/souptik23/Zynetic-Book-ApplicationV1.git)

[//]: # (Navigate to the project directory:)

[//]: # (bash)

[//]: # (cd Zynetic-Book-ApplicationV1)

[//]: # (Install dependencies:)

[//]: # (bash)

[//]: # (mvn install)

[//]: # (Running the Application)

[//]: # (Configure your MongoDB connection in application.properties)

[//]: # (Run the application:)

[//]: # (bash)

[//]: # (mvn spring-boot:run)

[//]: # (The API will be available at http://localhost:8080)

[//]: # (API Documentation)

[//]: # (Authentication)

[//]: # (User Registration)

[//]: # (Register a new user account.)

[//]: # (Endpoint: POST /auth/signup)

[//]: # (Request Body:)

[//]: # ({)

[//]: # ("username": "string",)

[//]: # ("password": "string",)

[//]: # ("email": "string")

[//]: # (})

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: "User Registered")

[//]: # (User Login)

[//]: # (Authenticate a user and retrieve a JWT token.)

[//]: # (Endpoint: POST /auth/login)

[//]: # (Request Body:)

[//]: # ({)

[//]: # ("username": "string",)

[//]: # ("password": "string")

[//]: # (})

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: JWT Token &#40;string&#41;)

[//]: # (add  “Bearer” Keyword before the key token)

[//]: # (Book Management)

[//]: # (Create a Book)

[//]: # (Add a new book to the bookstore.)

[//]: # (Endpoint: POST /api/book/book-register)

[//]: # (Request Body:)

[//]: # ({)

[//]: # ("id": "string",)

[//]: # ("name": "string",)

[//]: # ("author": "string",)

[//]: # ("category": "string",)

[//]: # ("price": "number",)

[//]: # ("rating": "number")

[//]: # (})

[//]: # (Response:)

[//]: # (Status Code: 201 Created)

[//]: # (Body: Created book object)

[//]: # ()
[//]: # (Get All Books)

[//]: # (Retrieve all books in the bookstore.)

[//]: # (Endpoint: GET /api/book/all-books)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Array of book objects)

[//]: # ()
[//]: # (Get Book by ID)

[//]: # (Retrieve a specific book by its ID.)

[//]: # (Endpoint: GET /api/book/{id})

[//]: # (Path Parameters:)

[//]: # (id: Book identifier)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Book object)

[//]: # ()
[//]: # (Update Book)

[//]: # (Update an existing book's information.)

[//]: # (Endpoint: PUT /api/book/{id})

[//]: # (Path Parameters:)

[//]: # (id: Book identifier)

[//]: # (Request Body:)

[//]: # ()
[//]: # ({)

[//]: # ("name": "string",)

[//]: # ("author": "string",)

[//]: # ("category": "string",)

[//]: # ("price": "number",)

[//]: # ("rating": "number")

[//]: # (})

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Updated book object)

[//]: # ()
[//]: # (Delete Book)

[//]: # (Remove a book from the bookstore.)

[//]: # (Endpoint: DELETE /api/book/{id})

[//]: # (Path Parameters:)

[//]: # (id: Book identifier)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: "Book with ID {id} deleted successfully.")

[//]: # ()
[//]: # (Filtering & Search)

[//]: # (Filter by Author)

[//]: # (Endpoint: GET /api/book/filter/author)

[//]: # (Query Parameters:)

[//]: # (author: Author name)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Array of filtered book objects)

[//]: # ()
[//]: # (Filter by Category)

[//]: # (Endpoint: GET /api/book/filter/category)

[//]: # (Query Parameters:)

[//]: # (category: Book category)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Array of filtered book objects)

[//]: # ()
[//]: # (Filter by Rating)

[//]: # (Endpoint: GET /api/book/filter/rating)

[//]: # (Query Parameters:)

[//]: # (rating: Minimum rating value)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Array of filtered book objects)

[//]: # ()
[//]: # (Search by Name)

[//]: # (Search for books by name containing a keyword.)

[//]: # (Endpoint: GET /api/book/search/name)

[//]: # (Query Parameters:)

[//]: # (keyword: Search term)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Array of matched book objects)

[//]: # ()
[//]: # (Search by Author with Sorting)

[//]: # (Search for books by author with sorting options.)

[//]: # (Endpoint: GET /api/book/search/by-sorted-author)

[//]: # (Query Parameters:)

[//]: # (author: Author name)

[//]: # (sortBy: Field to sort by &#40;default: "rating"&#41;)

[//]: # (direction: Sort direction &#40;"asc" or "desc", default: "desc"&#41;)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Array of sorted book objects)

[//]: # ()
[//]: # (Combined Filter)

[//]: # (Filter books by author, category, and rating simultaneously.)

[//]: # (Endpoint: GET /api/book/filter)

[//]: # (Query Parameters:)

[//]: # (author: Author name)

[//]: # (category: Book category)

[//]: # (rating: Minimum rating value)

[//]: # (Response:)

[//]: # (Status Code: 200 OK)

[//]: # (Body: Array of filtered book objects)

[//]: # (cURL Example:)

[//]: # (bash)

[//]: # (curl -X GET "https://zynetic-book-applicationv1-1.onrender.com/api/book/filter?author=Fitzgerald&category=Fiction&rating=4.0" \)

[//]: # ()
[//]: # (Security)

[//]: # (The API uses JWT &#40;JSON Web Token&#41; for authentication)

[//]: # (Include the JWT token in the Authorization header for protected endpoints:)

[//]: # (Authorization: Bearer {token})

[//]: # (Passwords are securely encoded using BCrypt before storing in the database)

[//]: # (User accounts can be enabled/disabled for additional security control)

[//]: # (Error Handling)

[//]: # (The API returns appropriate HTTP status codes and error messages:)

[//]: # ()
[//]: # (Database Structure)

[//]: # (Book Collection)

[//]: # (json)

[//]: # ({)

[//]: # ("id": "string",)

[//]: # ("name": "string",)

[//]: # ("author": "string",)

[//]: # ("category": "string",)

[//]: # ("price": "number",)

[//]: # ("rating": "number")

[//]: # (})

[//]: # (Users Collection)

[//]: # ({)

[//]: # ("username": "string",)

[//]: # ("password": "string &#40;encrypted&#41;",)

[//]: # ("email": "string",)

[//]: # ("enabled": "boolean")

[//]: # (})

[//]: # ()
[//]: # ()
[//]: # ()
[//]: # ()
