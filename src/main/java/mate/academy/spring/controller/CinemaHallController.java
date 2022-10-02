package mate.academy.spring.controller;

import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import mate.academy.spring.dao.impl.CinemaHallDaoImpl;
import mate.academy.spring.dto.request.CinemaHallRequestDto;
import mate.academy.spring.dto.response.CinemaHallResponseDto;
import mate.academy.spring.model.CinemaHall;
import mate.academy.spring.service.CinemaHallService;
import mate.academy.spring.service.mapper.RequestDtoMapper;
import mate.academy.spring.service.mapper.ResponseDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema-halls")
public class CinemaHallController {
    private final CinemaHallService cinemaHallService;
    private final RequestDtoMapper<CinemaHallRequestDto, CinemaHall> cinemaHallRequestDtoMapper;
    private final ResponseDtoMapper<CinemaHallResponseDto, CinemaHall> cinemaHallResponseDtoMapper;
    private final CinemaHallDaoImpl cinemaHallDao;

    public CinemaHallController(CinemaHallService cinemaHallService,
                                RequestDtoMapper<CinemaHallRequestDto, CinemaHall>
                                        cinemaHallRequestDtoMapper,
                                ResponseDtoMapper<CinemaHallResponseDto, CinemaHall>
                                        cinemaHallResponseDtoMapper,
                                CinemaHallDaoImpl cinemaHallDao) {
        this.cinemaHallService = cinemaHallService;
        this.cinemaHallRequestDtoMapper = cinemaHallRequestDtoMapper;
        this.cinemaHallResponseDtoMapper = cinemaHallResponseDtoMapper;
        this.cinemaHallDao = cinemaHallDao;
    }

    @PostMapping
    public CinemaHallResponseDto add(@RequestBody @Valid CinemaHallRequestDto requestDto) {
        CinemaHall cinemaHall = cinemaHallService.add(
                    cinemaHallRequestDtoMapper.mapToModel(requestDto));
        return cinemaHallResponseDtoMapper.mapToDto(cinemaHall);
    }

    @GetMapping
    public List<CinemaHallResponseDto> getAll() {
        return cinemaHallService.getAll()
                .stream()
                .map(cinemaHallResponseDtoMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/getwitherror")
    public CinemaHallResponseDto get(@RequestParam Long cinemaHallId) {
        return cinemaHallResponseDtoMapper.mapToDto(cinemaHallDao.get(cinemaHallId).get());
    }
}
