### 3. Abstract Factory Pattern
**Category**: Creational

**Definition**: The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

**Problem**:
- How to create families of related objects without depending on their concrete classes
- How to ensure that created objects work together

**Solution**:
- Define an abstract factory interface with methods for creating products
- Implement concrete factories for each product family
- Client code works with factories and products through abstract interfaces

**Implementation Components**:
- `GUIFactory` interface: Declares methods for creating buttons
- Concrete factories: `WindowsFactory` and `MacOSFactory`
- Product interface: `Button`
- Concrete products: `WindowsButton` and `MacOSButton`
- `Application`: Uses the factory to create appropriate products

**Use Case**:
The Abstract Factory pattern is useful when:
- A system should be independent of how its products are created, composed, and represented
- A system should be configured with one of multiple families of products
- Related product objects need to be used together and this constraint needs to be enforced
- You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations