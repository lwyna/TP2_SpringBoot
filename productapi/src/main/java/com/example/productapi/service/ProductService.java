package com.example.productapi.service;

import com.example.productapi.dto.ProductRequest;
import com.example.productapi.dto.ProductResponse;
import com.example.productapi.exception.ResourceNotFoundException;
import com.example.productapi.model.Product;
import com.example.productapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductResponse createProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        Product saved = repository.save(product);
        return mapToResponse(saved);
    }

    private ProductResponse mapToResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getQuantity());
    }
    // Autres méthodes : getAll, getById, update, delete

    public List<ProductResponse> getAllProducts() {
        return null;
    }

    public void getByProductId(Long id) {
    }

    public ProductResponse updateProduct(Long id, ProductRequest request) {
        return null;
    }

    public void deleteProduct(Long id) {
    }
    public ProductResponse getProductById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produit introuvable avec l'id: " + id));
        return mapToResponse(product);
    }

}
