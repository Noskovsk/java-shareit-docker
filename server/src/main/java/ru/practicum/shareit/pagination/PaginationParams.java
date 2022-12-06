package ru.practicum.shareit.pagination;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class PaginationParams {
    public static PageRequest createPageRequest(Integer from, Integer size, String orderField) {
        System.out.println("fr" + from + ", sz" + size);
        return PageRequest.of(from / size, size, Sort.by(orderField).descending());
        //return PageRequest.of(validateFrom(from) / validateSize(size), validateSize(size), Sort.by(orderField).descending());
    }

    public static PageRequest createPageRequest(Integer from, Integer size) {
        System.out.println("fr" + from + ", sz" + size);
        return PageRequest.of(from / size, size);
        //return PageRequest.of(validateFrom(from) / validateSize(size), validateSize(size));
    }

//    private static Integer validateFrom(Integer from) {
//        if (from != null && from < 0) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Неверные параметры пагинации.");
//        }
//        if (from == null) {
//            from = 0;
//        }
//        return from;
//    }
//
//    private static Integer validateSize(Integer size) {
//        if (size != null && size <= 0) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Неверные параметры пагинации.");
//        }
//        if (size == null) {
//            size = Integer.MAX_VALUE;
//        }
//        return size;
//    }
}
