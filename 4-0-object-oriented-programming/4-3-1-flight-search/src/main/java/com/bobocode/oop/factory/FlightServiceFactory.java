package com.bobocode.oop.factory;

import com.bobocode.oop.service.FlightService;

import java.util.Objects;

/**
 * {@link FlightServiceFactory} is used to create an instance of {@link FlightService}
 * <p>
 * todo: 1. Implement method {@link FlightServiceFactory#creteFlightService()}
 */
public class FlightServiceFactory {

    private final FlightService flightService = new FlightService();

    /**
     * Create a new instance of {@link FlightService}
     *
     * @return FlightService
     */
    public FlightService creteFlightService() {
        return flightService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightServiceFactory that = (FlightServiceFactory) o;
        return Objects.equals(flightService, that.flightService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightService);
    }
}
