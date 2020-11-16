# Table of Contents
* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [Contact](#contact)

# About the Project

# Built With
* Java 1.8
* Spring Boot 2.3.5
* io.jsonwebtoken 0.11.2
* Maven 3.6.3

# Getting Started
# Prerequisites
* Java SDK 1.8
* Maven 3.6.3

# Installation
```bash
git clone https://github.com/jeortizquan/user-service.git
```

# Usage
### To run
```
mvn spring-boot:run
```
### To login POST 
```
http://localhost:8081/authenticate
```
Body
```
{
    "username": "user",
    "password": "ciphercode"
}
```
### To test GET
Headers
```
Bearer {Token}
```
```
http://localhost:8081/index
```

# Roadmap
# Contributing
Any contributions you make are appreciated.

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request
# License
# Contact
# Acknowledgements
