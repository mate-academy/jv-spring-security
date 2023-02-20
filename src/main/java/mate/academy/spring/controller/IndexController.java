package mate.academy.spring.controller;

import mate.academy.spring.model.CinemaHall;
import mate.academy.spring.model.Movie;
import mate.academy.spring.model.MovieSession;
import mate.academy.spring.model.User;
import mate.academy.spring.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class IndexController {
    private UserService userService;
    private ShoppingCartService shoppingCartService;
    private OrderService orderService;
    private MovieSessionService movieSessionService;
    private MovieService movieService;
    private CinemaHallService cinemaHallService;
    private AuthenticationService authenticationService;

    public IndexController(UserService userService, ShoppingCartService shoppingCartService,
                           OrderService orderService, MovieSessionService movieSessionService,
                           MovieService movieService, CinemaHallService cinemaHallService, AuthenticationService authenticationService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.orderService = orderService;
        this.movieSessionService = movieSessionService;
        this.movieService = movieService;
        this.cinemaHallService = cinemaHallService;
        this.authenticationService = authenticationService;
    }

    @GetMapping("/inject")
    public String inject() {
        injectData();
        return "Done";
    }

    private void injectData() {
        Movie movie = new Movie();
        movie.setTitle("People X");
        movie.setDescription("Action film");
        Movie savedMovie = movieService.add(movie);

        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.setCapacity(10);
        cinemaHall.setDescription("VIP");
        CinemaHall savedCinemaHall = cinemaHallService.add(cinemaHall);

        MovieSession movieSession = new MovieSession();
        movieSession.setMovie(savedMovie);
        movieSession.setCinemaHall(savedCinemaHall);
        movieSession.setShowTime(LocalDateTime.of(2023, 02, 21, 15, 00));
        MovieSession peopleX202302211500 = movieSessionService.add(movieSession);

        MovieSession movieSession1 = new MovieSession();
        movieSession1.setMovie(savedMovie);
        movieSession1.setCinemaHall(savedCinemaHall);
        movieSession1.setShowTime(LocalDateTime.of(2023, 02, 21, 18, 00));
        MovieSession peopleX202302211800 = movieSessionService.add(movieSession1);

        User user = new User();
        user.setEmail("Dan@gmail.com");
        user.setPassword("123");
        User savedUser = authenticationService.register(user.getEmail(), user.getPassword());
    }
}
