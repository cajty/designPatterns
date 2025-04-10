## 4. Singleton Pattern
**Category**: Creational

**Definition**: The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

**Problem**:
- How to ensure a class has only one instance
- How to provide a global access point to that instance

**Solution**:
- Make the constructor private to prevent instantiation from outside
- Create a static method that returns the instance, creating it if necessary
- Ensure thread safety in concurrent environments

**Implementation Components**:
- `Singleton` class: With private constructor, static instance field, and public getInstance method

**Use Case**:
The Singleton pattern is useful when:
- Exactly one instance of a class is needed to coordinate actions across the system
- You need stricter control over global variables
- The single instance needs lazy initialization