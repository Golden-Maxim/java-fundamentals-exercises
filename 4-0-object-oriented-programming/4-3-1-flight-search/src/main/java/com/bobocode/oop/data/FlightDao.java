package com.bobocode.oop.data;

import com.bobocode.util.ExerciseNotCompletedException;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * {@link FlightDao} represents a Data Access Object (DAO) for flights. The implementation is simplified, so it just
 * uses {@link HashSet} to store flight numbers.
 * <p>
 * todo: 1. Implement a method {@link FlightDao#register(String)} that store new flight number into the set
 * todo: 2. Implement a method {@link FlightDao#findAll()} that returns a set of all flight numbers
 */
public class FlightDao {
    private final Set<String> flights = new HashSet<>();

    /**
     * Stores a new flight number
     *
     * @param flightNumber a flight number to store
     * @return {@code true} if a flight number was stored, {@code false} otherwise
     */
    public boolean register(String flightNumber) {
        return this.flights.add(flightNumber);
    }

    /**
     * Returns all stored flight numbers
     *
     * @return a set of flight numbers
     */
    public Set<String> findAll() {
        return this.flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDao flightDao = (FlightDao) o;
        return Objects.equals(flights, flightDao.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flights);
    }
}
