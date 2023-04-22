package com.example.demo.products

import org.springframework.data.repository.CrudRepository

interface ProductRepository:CrudRepository<ProductModel, Int> {
}