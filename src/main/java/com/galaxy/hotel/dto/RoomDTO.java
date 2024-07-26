package com.galaxy.hotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.galaxy.hotel.entity.Booking;
import jakarta.persistence.ElementCollection;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {

    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private String roomPhotoUrl;
    private String roomDescription;

//    @ElementCollection
    private List<BookingDTO> bookings;
}
