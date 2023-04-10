package com.skypro.simpleaviasales.model;

import lombok.Generated;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.time.Instant;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Flight.class)
public abstract class Flight_ {
    public static volatile SingularAttribute<Flight, String> flightNumber;
    public static volatile SingularAttribute<Flight, Airport> departureAirport;
    public static volatile SingularAttribute<Flight, Airport> arrivalAirport;
    public static volatile SingularAttribute<Flight, Airline> airline;
    public static volatile SingularAttribute<Flight, Instant> departureDate;
    public static volatile SingularAttribute<Flight, Instant> arrivalDate;

    public static final String FLIGHT_NUMBER = "flightNumber";
    public static final String DEPARTURE_AIRPORT = "departureAirport";
    public static final String ARRIVAL_AIRPORT = "arrivalAirport";
    public static final String AIRLIINE = "airline";
    public static final String DEPARTURE_DATE = "departureDate";
    public static final String ARRIVAL_DATE = "arrivalDate";

}