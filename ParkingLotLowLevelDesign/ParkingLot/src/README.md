# Parking System

A parking management system designed to simulate the entry and exit of vehicles in a parking lot, calculate parking rates, and manage parking spot occupancy. The system handles both two-wheeler and four-wheeler vehicles, generating tickets upon entry and processing payments upon exit.

## Features

- **Ticket Generation**: Generates a ticket with unique ID, vehicle details, and parking spot information upon vehicle entry.
- **Rate Calculation**: Calculates parking charges based on the duration a vehicle is parked.
- **Spot Occupancy**: Handles parking spot availability and manages occupancy for two-wheeler and four-wheeler vehicles.
- **Payment Processing**: Processes vehicle exit by verifying payment and de-occupying the parking spot.

## Structure

### `Gates` Module
Contains classes for entrance and exit gates.

- **EntranceGate**: Handles the generation of parking tickets when a vehicle enters the parking lot.
- **ExitGate**: Handles payment processing when a vehicle exits the parking lot.

### `ParkingSpot` Module
Contains classes for managing parking spots.

- **ParkingSpot**: Abstract class for defining general parking spot behavior.
- **FourWheelerSpot**: Inherits from `ParkingSpot`, defines behavior for parking four-wheeled vehicles.
- **TwoWheelerSpot**: Inherits from `ParkingSpot`, defines behavior for parking two-wheeled vehicles.
- **ParkingManager**: Abstract class responsible for managing parking spot occupancy.
- **FourWheelerParkingManager**: Manages four-wheeler parking spots.
- **TwoWheelerParkingManager**: Manages two-wheeler parking spots.
- **ParkingManagerFactory**: Factory class to return the correct `ParkingManager` based on vehicle type.

### `Ticket` Module
Handles ticket management.

- **Ticket**: Contains information about a vehicle's ticket, including the vehicle, parking spot, and time.
- **TicketManager**: Generates new tickets for vehicles.

### `Vehicle` Module
Defines vehicle types.

- **Vehicle**: Abstract class representing a vehicle with a vehicle number.
- **FourWheeler**: Inherits from `Vehicle`, represents a four-wheeler vehicle.
- **TwoWheeler**: Inherits from `Vehicle`, represents a two-wheeler vehicle.

## How It Works

1. **Vehicle Entry**:
   - When a vehicle enters, the `EntranceGate` generates a ticket using the `ParkingManager` for the vehicle's type.
   - The ticket contains the parking spot and time of entry.

2. **Vehicle Exit**:
   - When a vehicle exits, the `ExitGate` verifies the payment based on the rate calculated using the duration of the vehicle's stay.
   - After payment is received, the parking spot is de-occupied.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        // Simulate vehicle entry
        Vehicle vehicle = new FourWheeler("XYZ123");
        EntranceGate entranceGate = EntranceGateManager.getGate();
        Ticket ticket = entranceGate.generateTicket(vehicle);
        
        // Simulate vehicle exit
        ExitGate exitGate = ExitGateManager.getGate();
        int totalAmount = exitGate.getTotal(vehicle);
        boolean paymentStatus = exitGate.receivePayment(ticket, totalAmount);
        
        if(paymentStatus) {
            System.out.println("Payment successful. Vehicle exited.");
        } else {
            System.out.println("Payment failed.");
        }
    }
}
