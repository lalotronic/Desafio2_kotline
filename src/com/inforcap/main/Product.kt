package com.inforcap.main

data class Product(
    val id: Int,
    var name: String,
    val description: String?,
    var isAvailable: Boolean = true,
    var isEnable: Boolean = true,
    var stock: Int = 0,
)
//si la description es null mostrar N/A
fun String?.showNA(description: String?): String = description?: "N/A"

//en vez de mostrar el boolean muestra si o no
fun Boolean.YesOrNo(isTrue:Boolean): String = if(isTrue) "Si" else "No"//Cambiamos lo boolean por si o no

//muestra sin stock en vez de 0
fun Int.hasStock(stock: Int): String = if(stock>0) stock.toString() else "Sin stock"