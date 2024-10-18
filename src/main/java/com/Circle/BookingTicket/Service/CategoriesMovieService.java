package com.Circle.BookingTicket.Service;

import com.Circle.BookingTicket.Model.CategoriesMovie;
import com.Circle.BookingTicket.Repository.CategoriesMovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesMovieService {

    @Autowired
    private CategoriesMovieRepository categoriesMovieRepository;

    public Page<CategoriesMovie> getAllCategories(Pageable pageable) {
        return categoriesMovieRepository.findAll(pageable);
    }

    public Optional<CategoriesMovie> getCategoryById(int id) {
        return categoriesMovieRepository.findById(id);
    }

    public CategoriesMovie createCategory(CategoriesMovie category) {
        return categoriesMovieRepository.save(category);
    }

    public CategoriesMovie updateCategory(int id, CategoriesMovie updatedCategory) {
        Optional<CategoriesMovie> categoryOptional = categoriesMovieRepository.findById(id);
        if (categoryOptional.isPresent()) {
            CategoriesMovie category = categoryOptional.get();
            category.setName(updatedCategory.getName());
            return categoriesMovieRepository.save(category);
        }
        return null; // Nếu không tìm thấy category, bạn có thể xử lý lỗi tùy chọn.
    }

    public void deleteCategory(int id) {
        categoriesMovieRepository.deleteById(id);
    }
}
