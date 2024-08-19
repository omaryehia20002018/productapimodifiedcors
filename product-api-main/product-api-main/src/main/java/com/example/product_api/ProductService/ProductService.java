package com.example.product_api.ProductService;

import com.example.product_api.dto.ProductDto;
import com.example.product_api.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    public ProductDto addProduct(ProductDto productDto);

    public ProductDto addProductforuser(ProductDto productDto,Long userid);
    public ProductDto getProductbyid(int id);

    public ProductDto getProductbyidforuser(int id,Long userid);

    public void deleteproductbyid(int id);

    public boolean isAvailable(int id);

    public ProductDto updateProduct(ProductDto productDto);

    public List<ProductDto> findProductByname(String name);

    public Page<ProductDto> getAllProducts(int page,int size);

    public Page<ProductDto> getAllProductsforuser(int page,int size,Long userid);

    public ProductDto updateProducts(ProductDto productDto,int id);
}
