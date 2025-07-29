# Strategy Pattern - Credit Card Payment Processing

This package demonstrates the Strategy Design Pattern applied to credit card payment processing.

## Overview

The Strategy Pattern allows the `Order` class to use different payment strategies (Visa, MasterCard) without changing its own code. The payment behavior is encapsulated in separate strategy objects that can be swapped at runtime.

## Class Structure

### Core Classes
- **`Order`** - The context class that delegates payment to strategies
- **`CreditCard`** - Contains credit card details
- **`CreditCardPayment`** - Strategy interface defining payment contract
- **`VisaPayment`** - Concrete strategy for Visa payments
- **`MasterCardPayment`** - Concrete strategy for MasterCard payments

### Strategy Pattern Elements
- **Context**: `Order` class holds a reference to `CreditCardPayment` strategy
- **Strategy Interface**: `CreditCardPayment` defines the payment contract
- **Concrete Strategies**: `VisaPayment` and `MasterCardPayment` implement different payment behaviors
- **Delegation**: `Order.pay()` delegates to `creditCardPayment.pay()`

## How to Run

```bash
mvn clean compile exec:java -f strategy-pattern-order/pom.xml
```

## Example Output

```
=== Processing Order 1 with Visa ===
Processing payment with Visa card
Order ORD-001 paid successfully. Total: $150.0

=== Processing Order 2 with MasterCard ===
Processing payment with MasterCard
Order ORD-002 paid successfully. Total: $75.5

=== Switching payment strategy for Order 1 ===
Processing payment with MasterCard
Order ORD-001 paid successfully. Total: $150.0
```

## Benefits

1. **Open/Closed Principle**: New payment types can be added without modifying existing code
2. **Single Responsibility**: Each strategy class has one responsibility
3. **Runtime Flexibility**: Payment strategies can be changed at runtime
4. **Testability**: Each strategy can be tested independently

## UML Diagram

See `src/main/resources/strategy-pattern-uml.txt` for the UML diagram description.