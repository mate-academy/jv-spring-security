package mate.academy.spring.service.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToObj(D dto);
}
