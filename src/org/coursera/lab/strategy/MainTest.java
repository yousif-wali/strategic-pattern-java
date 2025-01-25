package org.coursera.lab.strategy;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testHandlingStrategies() {
        // Test individual handling strategies
        HandlingStrategy safety = new SafetyHandling();
        HandlingStrategy sport = new SportHandling();
        HandlingStrategy racing = new RacingHandling();

        assertDoesNotThrow(() -> safety.handle());
        assertDoesNotThrow(() -> sport.handle());
        assertDoesNotThrow(() -> racing.handle());
    }

    @Test
    public void testCarHandling() {
        // Test cars with default handling strategies
        Car coupe = new Coupe(new SafetyHandling());
        Car sedan = new Sedan(new SportHandling());
        Car convertible = new Convertible(new RacingHandling());

        assertEquals("coupe 1", coupe.name);
        assertEquals("sedan 2", sedan.name);
        assertEquals("convertible 3", convertible.name);

        // Capture the behavior
        coupe.handle(); // Expected output: "coupe 1 eases through turn"
        sedan.handle(); // Expected output: "sedan 2 makes a tight turn"
        convertible.handle(); // Expected output: "convertible 3 skids through a turn"
    }

    @Test
    public void testDynamicHandlingChange() {
        // Test dynamically changing the handling strategy
        Car coupe = new Coupe(new SafetyHandling());
        coupe.handle(); // Expected: "coupe 1 eases through turn"

        // Change handling strategy
        coupe.setHandlingStrategy(new RacingHandling());
        coupe.handle(); // Expected: "coupe 1 skids through a turn"
    }

    @Test
    public void testAllCombinations() {
        // Instantiate handling strategies
        HandlingStrategy safety = new SafetyHandling();
        HandlingStrategy sport = new SportHandling();
        HandlingStrategy racing = new RacingHandling();

        // Create all combinations of cars and handling strategies
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Coupe(safety));
        cars.add(new Coupe(sport));
        cars.add(new Coupe(racing));
        cars.add(new Sedan(safety));
        cars.add(new Sedan(sport));
        cars.add(new Sedan(racing));
        cars.add(new Convertible(safety));
        cars.add(new Convertible(sport));
        cars.add(new Convertible(racing));

        // Verify each car can handle without exceptions
        for (Car car : cars) {
            assertDoesNotThrow(car::handle);
        }
    }
}
