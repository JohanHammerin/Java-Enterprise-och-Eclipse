package se.johan.lektion_3.product.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.johan.lektion_3.product.dto.NameProductDTO;
import se.johan.lektion_3.product.dto.ProductDTO;
import se.johan.lektion_3.product.model.Product;
import se.johan.lektion_3.product.service.ProductService;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/createProduct")
    public ResponseEntity<ProductDTO> createProduct(@Valid @RequestBody ProductDTO productDTO) {
        productService.createProduct(productDTO);
        return ResponseEntity.ok(productDTO);
    }

    @GetMapping("/findByName")
    public ResponseEntity<NameProductDTO> findByName(@Valid @RequestBody NameProductDTO nameProductDTO) {
        productService.findByName(nameProductDTO.name());
        return ResponseEntity.ok(nameProductDTO);
    }
}
