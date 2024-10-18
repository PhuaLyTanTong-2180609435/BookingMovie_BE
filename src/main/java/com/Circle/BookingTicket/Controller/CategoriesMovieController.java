package com.Circle.BookingTicket.Controller;

import com.Circle.BookingTicket.Model.CategoriesMovie;
import com.Circle.BookingTicket.Service.CategoriesMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoriesMovieController {

    @Autowired
    private CategoriesMovieService categoriesMovieService;

    @GetMapping
    public Page<CategoriesMovie> getAllCategories(Pageable pageable) {
        return categoriesMovieService.getAllCategories(pageable);
    }


    @GetMapping("/{id}")
    public ResponseEntity<CategoriesMovie> getCategoryById(@PathVariable int id) {
        Optional<CategoriesMovie> category = categoriesMovieService.getCategoryById(id);
        return category.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CategoriesMovie createCategory(@RequestBody CategoriesMovie category) {
        return categoriesMovieService.createCategory(category);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriesMovie> updateCategory(@PathVariable int id, @RequestBody CategoriesMovie updatedCategory) {
        CategoriesMovie category = categoriesMovieService.updateCategory(id, updatedCategory);
        if (category != null) {
            return ResponseEntity.ok(category);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable int id) {
        categoriesMovieService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
