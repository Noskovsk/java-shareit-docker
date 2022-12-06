package ru.practicum.shareit.booking.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter
@Getter
public class BookingDto {
    private Long id;
    //@FutureOrPresent
    private LocalDateTime start;
    //@FutureOrPresent
    private LocalDateTime end;
    private Long itemId;
    private Long bookerId;
}
