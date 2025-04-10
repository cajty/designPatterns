## Adapter Pattern
**Category**: Structural

**Definition**: The Adapter pattern allows objects with incompatible interfaces to collaborate, acting as a bridge between them.

**Problem**:
- How to use a class with an interface that doesn't match what you need
- How to reuse existing code that doesn't have the interface you require

**Solution**:
- Create an adapter class that converts one interface to another
- The adapter wraps an instance of the class with the incompatible interface
- The adapter translates operations from the new interface to the original one

**Implementation Components**:
- `RoundHole`: Expects objects that implement the RoundPeg interface
- `SquarePeg`: Has an incompatible interface
- `SquarePegAdapter`: Adapts SquarePeg to work with RoundHole by extending RoundPeg

**Use Case**:
The Adapter pattern is useful when:
- You want to use an existing class but its interface doesn't match your requirements
- You need to create a reusable class that cooperates with classes that don't have compatible interfaces
- You need to integrate classes that couldn't otherwise work together due to incompatible interfaces