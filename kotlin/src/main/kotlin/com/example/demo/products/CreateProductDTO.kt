package com.example.demo.products

data class CreateProductDTO (
    val title:String,
    val price:Int
){
    fun toModel(): ProductModel = ProductModel(title = this.title, price = this.price)
}