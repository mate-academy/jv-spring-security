package mate.academy.spring.controller;

import java.time.LocalDateTime;
import java.time.Month;
import mate.academy.spring.model.CinemaHall;
import mate.academy.spring.model.Movie;
import mate.academy.spring.model.MovieSession;
import mate.academy.spring.service.AuthenticationService;
import mate.academy.spring.service.CinemaHallService;
import mate.academy.spring.service.MovieService;
import mate.academy.spring.service.MovieSessionService;
import mate.academy.spring.service.OrderService;
import mate.academy.spring.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inject")
public class InjectController {
    private final MovieService movieService;
    private final CinemaHallService cinemaHallService;
    private final MovieSessionService movieSessionService;
    private final ShoppingCartService shoppingCartService;
    private final OrderService orderService;
    private final AuthenticationService authService;

    public InjectController(MovieService movieService,
                            CinemaHallService cinemaHallService,
                            MovieSessionService movieSessionService,
                            ShoppingCartService shoppingCartService,
                            OrderService orderService,
                            AuthenticationService authService) {
        this.movieService = movieService;
        this.cinemaHallService = cinemaHallService;
        this.movieSessionService = movieSessionService;
        this.shoppingCartService = shoppingCartService;
        this.orderService = orderService;
        this.authService = authService;
    }

    @GetMapping
    public String inject() {
        authService.register("bob@i.ua","1234");
        authService.register("alex@i.ua","4321");
        Movie firstMovie = new Movie();
        firstMovie.setTitle("Terminator");
        firstMovie.setDescription("It stars Arnold Schwarzenegger as the Terminator, "
                + "a cyborg assassin sent back in time from 2029 to 1984 to kill "
                + "Sarah Connor.");
        Movie secondMovie = new Movie();
        secondMovie.setTitle("Rambo");
        secondMovie.setDescription("In the film, Rambo is a troubled "
                + "and misunderstood Vietnam veteran"
                + " who must rely on his combat and survival skills.");
        Movie thirdMovie = new Movie();
        thirdMovie.setTitle("Fight Club");
        thirdMovie.setDescription("Fight Club is a 1996 novel by Chuck Palahniuk."
                + " It follows the experiences "
                + "of an unnamed protagonist struggling with insomnia.");
        movieService.add(firstMovie);
        movieService.add(secondMovie);
        movieService.add(thirdMovie);
        CinemaHall firstCinemaHall = new CinemaHall();
        firstCinemaHall.setCapacity(30);
        firstCinemaHall.setDescription("Small yellow cinema hall.");
        CinemaHall secondCinemaHall = new CinemaHall();
        secondCinemaHall.setCapacity(45);
        secondCinemaHall.setDescription("Medium green cinema hall.");
        CinemaHall thirdCinemaHall = new CinemaHall();
        thirdCinemaHall.setCapacity(60);
        thirdCinemaHall.setDescription("Large red cinema hall.");
        cinemaHallService.add(firstCinemaHall);
        cinemaHallService.add(secondCinemaHall);
        cinemaHallService.add(thirdCinemaHall);
        MovieSession firstMovieSession = new MovieSession();
        firstMovieSession.setMovie(movieService.get(1L));
        firstMovieSession.setCinemaHall(cinemaHallService.get(3L));
        firstMovieSession.setShowTime(LocalDateTime.of(2022,Month.DECEMBER,28,15,30));
        MovieSession secondMovieSession = new MovieSession();
        secondMovieSession.setMovie(movieService.get(2L));
        secondMovieSession.setCinemaHall(cinemaHallService.get(1L));
        secondMovieSession.setShowTime(LocalDateTime.of(2022,Month.DECEMBER,28,18,45));
        MovieSession thirdMovieSession = new MovieSession();
        thirdMovieSession.setMovie(movieService.get(2L));
        thirdMovieSession.setCinemaHall(cinemaHallService.get(3L));
        thirdMovieSession.setShowTime(LocalDateTime.of(2022,Month.DECEMBER,29,12,10));
        MovieSession fourthMovieSession = new MovieSession();
        fourthMovieSession.setMovie(movieService.get(3L));
        fourthMovieSession.setCinemaHall(cinemaHallService.get(2L));
        fourthMovieSession.setShowTime(LocalDateTime.of(2022,Month.DECEMBER,29,14,20));
        MovieSession fifthMovieSession = new MovieSession();
        fifthMovieSession.setMovie(movieService.get(1L));
        fifthMovieSession.setCinemaHall(cinemaHallService.get(1L));
        fifthMovieSession.setShowTime(LocalDateTime.of(2022,Month.DECEMBER,28,9,15));
        MovieSession sixthMovieSession = new MovieSession();
        sixthMovieSession.setMovie(movieService.get(1L));
        sixthMovieSession.setCinemaHall(cinemaHallService.get(3L));
        sixthMovieSession.setShowTime(LocalDateTime.of(2022,Month.DECEMBER,29,21,55));
        movieSessionService.add(firstMovieSession);
        movieSessionService.add(secondMovieSession);
        movieSessionService.add(thirdMovieSession);
        movieSessionService.add(fourthMovieSession);
        movieSessionService.add(fifthMovieSession);
        movieSessionService.add(sixthMovieSession);
        return "All data injected!";
    }
}
