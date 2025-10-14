package se.johan.lektion_3.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.johan.lektion_3.product.dto.ProductDTO;
import se.johan.lektion_3.product.exception.ProductNotFoundException;
import se.johan.lektion_3.product.model.Product;
import se.johan.lektion_3.product.repository.ProductRepository;
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(ProductDTO productDTO) {
        // DTO → Entity
        Product product = new Product(
                productDTO.name(),
                productDTO.price()
        );
        productRepository.save(product);
    }

    public Product findByName(String name) {
        return productRepository.findByName(name)
                .orElseThrow(() -> new ProductNotFoundException("Kunde inte hitta namnet: " + name));
    }
}
