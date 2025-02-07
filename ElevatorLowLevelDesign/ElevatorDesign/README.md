# Elevator Control System

A Java-based elevator control system implementation that simulates multiple elevators serving multiple floors in a building. The system uses modern design patterns and supports extensible elevator selection strategies.

## Features

- Multiple elevator management
- Dynamic floor support
- External (floor) and internal (elevator) call buttons
- Priority-based request queuing
- Direction-based elevator scheduling
- Extensible elevator selection strategy system
- Asynchronous request handling

## System Architecture

The system is built using several key components:

### Core Components

1. **Building**
   - Central coordinator for the elevator system
   - Manages multiple elevators and floors
   - Handles floor selection and elevator calls

2. **Elevator**
   - Represents individual elevator cars
   - Maintains current floor, direction, and status
   - Contains internal button panel

3. **Floor**
   - Represents building floors
   - Contains external call buttons
   - Manages up/down requests

4. **ElevatorController**
   - Handles elevator movement logic
   - Manages request queues
   - Controls elevator status and direction

### Request Handling

- **Request Types**
  - External requests (from floors)
  - Internal requests (from within elevators)
  
- **Queue Management**
  - Separate queues for upward and downward requests
  - Priority-based request processing

## Usage

### Creating a Building

```java
Building building = new Building();  // Creates a building with 10 floors and 10 elevators
```

### Calling an Elevator

```java
// Call elevator from floor 3 going up
building.getLift(3, Direction.UP);
```

### Selecting a Floor

```java
// Select floor 5 from elevator 0
building.selectFloor(0, 5);
```

## Design Patterns Used

1. **Factory Pattern**
   - `ElevatorFactory` for creating elevator instances
   - Centralizes elevator creation logic

2. **Strategy Pattern**
   - `ExternalStrategy` for elevator selection
   - Allows for different elevator selection algorithms

3. **Command Pattern**
   - Button interface for encapsulating request operations
   - Separates request initiation from processing

## Extending the System

### Adding New Elevator Selection Strategies

1. Create a new strategy class implementing `ExternalStrategy`:
```java
public class NewStrategy implements ExternalStrategy {
    @Override
    public boolean getElevator(Request req) {
        // Implementation
    }
}
```

2. Add the strategy to `StrategyManager`:
```java
case "newStrategy":
    return new NewStrategy(controllers);
```

## System Requirements

- Java Development Kit (JDK) 8 or higher
- Multi-threading support
- Sufficient memory to handle request queues

## Project Structure

```
├── Building/
│   ├── Building.java
│   └── Floor.java
├── Buttons/
│   ├── Button.java
│   ├── ExternalButton.java
│   └── InternalButton.java
├── Elevator/
│   ├── Elevator.java
│   ├── ElevatorController.java
│   └── ElevatorFactory.java
├── Enums/
│   ├── Direction.java
│   └── Status.java
├── Misc/
│   └── Request.java
└── Strategy/
    ├── AllElevatorExternalStrategy.java
    ├── ExternalStrategy.java
    └── StrategyManager.java
```

## Future Enhancements

- Door control system
- Weight limit management
- Emergency stop functionality
- Elevator maintenance mode
- Advanced logging and monitoring
- Load balancing strategies
- Energy optimization algorithms

