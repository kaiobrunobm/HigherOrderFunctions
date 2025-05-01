package com.kaiobrunobm.higherorderfunctions.functions

import com.kaiobrunobm.higherorderfunctions.data.cookies

fun main () {
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }

    println("Total price: $$totalPrice")
}