# Staff Hiring Report Application

## Overview

The Staff Hiring Report application is a Java program designed to collect and evaluate staff hiring information based on unique staff numbers and hiring locations. It determines hiring eligibility and generates a report summarizing the findings.

## Features

- Collects staff number and hiring location from the user.
- Evaluates hiring eligibility based on the staff number.
- Displays a detailed staff hiring report.

## Components

1. **iStaff Interface**: Defines the methods for retrieving staff number, staff location, and the hiring process.
2. **Staff Abstract Class**: Implements the `iStaff` interface and contains common properties and methods for staff.
3. **StaffHiring Class**: Extends the `Staff` class, implements the hiring process logic, and provides functionality to print the hiring report.
4. **UseStaff Class**: Contains the `main` method that serves as the entry point for the application and handles user interaction.

## Installation

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone or download this repository to your local machine.
3. Navigate to the project directory.

## Usage

To run the application:

1. Open your terminal or command prompt.
2. Navigate to the project directory.
3. Compile the Java files using:
   ```bash
   javac ANSWERS/*.java
   ```
4. Run the application using:
   ```bash
   java ANSWERS.UseStaff
   ```
5. Follow the prompts to enter the current staff number and hiring location.

## Example

When you run the application, it will prompt you for the following:

```
Enter the current staff number: 15
Enter the staff hiring location: New York
```

The application will then output a report like this:

```
STAFF HIRING REPORT
********************
LOCATION: New York
STAFF NUMBER: 15
HIRE STAFF: YES
```
