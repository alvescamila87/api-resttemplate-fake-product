package com.camila.apiresttemplatefakeproduct.dto;

import java.util.List;

public record ProductDTO(Long id, String title, Double price, String category, String description, String image, RatingProductDTO rating) {
}
