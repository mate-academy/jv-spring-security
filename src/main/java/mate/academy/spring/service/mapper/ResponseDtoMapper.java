package mate.academy.spring.service.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T entity);

    default List<D> mapAllToDto(Collection<T> entities) {
        return entities
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }
}
