package ru.practicum.shareit;

import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.server.ResponseStatusException;
import ru.practicum.shareit.pagination.PaginationParams;

import static org.junit.jupiter.api.Assertions.*;

public class PaginationParamsTest {

    @Test
    void shouldCreateCorrectPageRequestWithoutOrder() {
        PageRequest pageRequest = PaginationParams.createPageRequest(5, 5);
        assertEquals(1, pageRequest.getPageNumber(), "Первая страница задана неверно.");
        assertEquals(5, pageRequest.getPageSize(), "Размер задан неверно.");
    }

    @Test
    void shouldCreateCorrectPageRequestWithOrder() {
        PageRequest pageRequest = PaginationParams.createPageRequest(0, 10, "id");
        assertEquals(Sort.by("id").descending(), pageRequest.getSort(), "Неверно задана сортировка");
    }
}
