package com.example.demo.products

import jakarta.persistence.*

@Entity
@Table(name = "products")
class ProductModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int = 0,
    var title:String,
    var price:Int
) {
}