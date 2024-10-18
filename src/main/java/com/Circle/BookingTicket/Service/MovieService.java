package com.Circle.BookingTicket.Service;

import com.Circle.BookingTicket.Model.Movie;
import com.Circle.BookingTicket.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Page<Movie> getAllMovies(Pageable pageable) {
        return movieRepository.findAll(pageable);
    }

    public Optional<Movie> getMovieById(int id) {
        return movieRepository.findById(id);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie(int id, Movie updatedMovie) {
        Optional<Movie> movieOptional = movieRepository.findById(id);
        if (movieOptional.isPresent()) {
            Movie movie = movieOptional.get();
            movie.setName(updatedMovie.getName());
            movie.setImg(updatedMovie.getImg());
            movie.setDirector(updatedMovie.getDirector());
            movie.setTrailer(updatedMovie.getTrailer());
            movie.setPremiere(updatedMovie.getPremiere());
            movie.setActors(updatedMovie.getActors());
            movie.setLanguage(updatedMovie.getLanguage());
            movie.setDuration(updatedMovie.getDuration());
            movie.setCategories(updatedMovie.getCategories());
            return movieRepository.save(movie);
        }
        return null; // Nếu không tìm thấy movie, bạn có thể xử lý lỗi tùy chọn.
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }
}
