package mate.academy.spring.controller;

import java.time.LocalDateTime;
import mate.academy.spring.model.CinemaHall;
import mate.academy.spring.model.Movie;
import mate.academy.spring.model.MovieSession;
import mate.academy.spring.model.User;
import mate.academy.spring.service.AuthenticationService;
import mate.academy.spring.service.CinemaHallService;
import mate.academy.spring.service.MovieService;
import mate.academy.spring.service.MovieSessionService;
import mate.academy.spring.service.OrderService;
import mate.academy.spring.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InjectController {
    public static final Long MOVIE_SESSIONS_DAY = 1L;
    private final AuthenticationService authenticationService;
    private final CinemaHallService cinemaHallService;
    private final MovieService movieService;
    private final MovieSessionService movieSessionService;
    private final ShoppingCartService cartService;
    private final OrderService orderService;

    public InjectController(MovieService movieService, CinemaHallService cinemaHallService,
                            MovieSessionService movieSessionService,
                            AuthenticationService authenticationService,
                            ShoppingCartService cartService, OrderService orderService) {
        this.movieService = movieService;
        this.cinemaHallService = cinemaHallService;
        this.movieSessionService = movieSessionService;
        this.authenticationService = authenticationService;
        this.cartService = cartService;
        this.orderService = orderService;
    }

    @GetMapping("/inject")
    public void injectData() {
        Movie fastAndFurious = new Movie();
        fastAndFurious.setTitle("Fast and Furious");
        fastAndFurious.setDescription("Awesome film");
        movieService.add(fastAndFurious);

        CinemaHall middleCinemaHall = new CinemaHall();
        middleCinemaHall.setCapacity(80);
        middleCinemaHall.setDescription("Middle hall");

        CinemaHall largeCinemaHall = new CinemaHall();
        largeCinemaHall.setCapacity(150);
        largeCinemaHall.setDescription("Large hall");

        cinemaHallService.add(middleCinemaHall);
        cinemaHallService.add(largeCinemaHall);

        MovieSession yesterdayMovieSession = new MovieSession();
        yesterdayMovieSession.setCinemaHall(middleCinemaHall);
        yesterdayMovieSession.setMovie(fastAndFurious);
        yesterdayMovieSession.setShowTime(LocalDateTime.now().minusDays(MOVIE_SESSIONS_DAY));

        MovieSession tomorrowMovieSession = new MovieSession();
        tomorrowMovieSession.setCinemaHall(middleCinemaHall);
        tomorrowMovieSession.setMovie(fastAndFurious);
        tomorrowMovieSession.setShowTime(LocalDateTime.now().plusDays(MOVIE_SESSIONS_DAY));

        movieSessionService.add(tomorrowMovieSession);
        movieSessionService.add(yesterdayMovieSession);

        User bob = authenticationService.register("bob@gmail.com", "1234");
        User alice = authenticationService.register("alice@gmail.com", "1234");

        cartService.addSession(tomorrowMovieSession, bob);
        cartService.addSession(tomorrowMovieSession, alice);
        cartService.addSession(yesterdayMovieSession, bob);

        orderService.completeOrder(cartService.getByUser(bob));
        orderService.completeOrder(cartService.getByUser(alice));
    }
}
