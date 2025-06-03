# Library Management System

##API testing
https://.postman.co/workspace/My-Workspace~3af779c8-1fcd-4cea-8bd4-8c4f79e6d3bf/collection/45553685-83eb2400-f01e-4a22-a96e-c92edf7b4410?action=share&creator=45553685

This project is a **Library Management System** built using Spring Boot. It supports basic operations to manage authors, categories, publishers, books, library members, and the borrowing/returning of books.

## Features Implemented

### 1. Author Management
- Add new authors
- Update author details
- View all authors

### 2. Category Management
- Add book categories (e.g., Fiction, History, Science)
- Update or delete categories
- View list of categories

### 3. Publisher Management
- Add publishers
- Update publisher details
- View all publishers

### 4. Book Management
- Add books with references to:
  - Authors
  - Categories
  - Publishers
- Update and delete book information
- View all available books

### 5. Member Management
- Add new library members 
- Update member information
- View member list

### 6. Borrowing and Returning Books
- Members can borrow available books
- Books have borrowing dates and return deadlines
- Return books and update status to available
- Prevent borrowing of already borrowed books

###the login may fail under certain edge cases, such as malformed tokens or expired credentials.
This will be resolved in upcoming updates
