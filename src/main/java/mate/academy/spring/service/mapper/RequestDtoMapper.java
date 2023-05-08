package mate.academy.spring.service.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);

    default List<T> mapAllToModel(Collection<D> dtos) {
        return dtos
                .stream()
                .map(this::mapToModel)
                .collect(Collectors.toList());
    }
}
