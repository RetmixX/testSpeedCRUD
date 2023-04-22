package com.example.demo.products

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("kotlin/products")
class ProductController(private val productRepository: ProductRepository) {

    @GetMapping
    fun getProducts():List<ProductModel> = productRepository.findAll().toList()

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id:Int): ProductModel = productRepository.findById(id).get()

    @PostMapping
    fun createProduct(@RequestBody data: CreateProductDTO): ResponseEntity<ProductModel> =
        ResponseEntity.status(201).body(productRepository.save(data.toModel()))

    @PatchMapping("/{id}")
    fun updateProduct(@PathVariable id:Int, @RequestBody data: CreateProductDTO): ProductModel {
        val product = productRepository.findById(id).get()
        product.price = data.price
        product.title = data.title
        return productRepository.save(product)
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable id:Int): ResponseEntity<String> {
        productRepository.delete(productRepository.findById(id).get())
        return ResponseEntity.ok("Удален")
    }
}