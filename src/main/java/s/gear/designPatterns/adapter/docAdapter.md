## Observer Pattern
**Category**: Behavioral

**Definition**: The Observer pattern establishes a one-to-many relationship between objects, where when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.

**Problem**:
- How to establish relationships between objects at runtime
- How to notify dependent objects when changes occur

**Solution**:
- Define a subject that maintains a list of observers
- When the subject changes, it notifies all observers
- Observers react to the notification with appropriate behavior

**Implementation Components**:
- `EventListener` interface: Defines the update method that observers must implement
- `EventManager`: Subject that maintains a list of observers and notifies them
- `Editor`: Contains the core functionality and uses EventManager to notify observers
- Concrete observers: `LogOpenListener` and `EmailNotificationListener`

**Use Case**:
The Observer pattern is useful when:
- Changes to one object require changing others, and you don't know how many objects need to change
- An object needs to notify other objects without making assumptions about what those objects are
- A subject needs to notify observers without coupling to their concrete classes