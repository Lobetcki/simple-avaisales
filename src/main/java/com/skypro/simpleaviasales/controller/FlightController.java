package com.skypro.simpleaviasales.controller;

import com.skypro.simpleaviasales.dto.FilterDTO;
import com.skypro.simpleaviasales.dto.FlightDTO;
import com.skypro.simpleaviasales.model.Flight;
import com.skypro.simpleaviasales.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<FlightDTO> getFlights(FilterDTO filterDTO) {
        return flightService.getFlightsFiltered(filterDTO);
    }

    @GetMapping("/{flightNumber}")
    public ResponseEntity<FlightDTO> getFlight(@PathVariable String flightNumber) {
        return ResponseEntity.ok(FlightDTO.from(
                flightService.getFlightByFlightNumber(flightNumber)));
    }


}
