package com.kaiobrunobm.higherorderfunctions.functions

import com.kaiobrunobm.higherorderfunctions.data.cookies

val softBakedMenu = cookies.filter { it.softBaked }

fun main() {
    println("Soft baked Menu:")
    softBakedMenu.forEach { cookie ->
        (println("${cookie.name} - $${cookie.price}"))
    }
}