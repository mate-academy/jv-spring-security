package mate.academy.spring.controller;

import mate.academy.spring.model.CinemaHall;
import mate.academy.spring.service.CinemaHallService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inject")
public class InjectController {
    private final CinemaHallService cinemaHallService;

    public InjectController(CinemaHallService cinemaHallService) {
        this.cinemaHallService = cinemaHallService;
    }

    @GetMapping
    public String injectData() {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setCapacity(20);
        cinemaHall.setDescription("red chairs");
        cinemaHallService.add(cinemaHall);
        CinemaHall cinemaHall2 = new CinemaHall();
        cinemaHall2.setCapacity(30);
        cinemaHall2.setDescription("black chairs");
        cinemaHallService.add(cinemaHall2);
        return "Injection data - Done!";
    }
}
