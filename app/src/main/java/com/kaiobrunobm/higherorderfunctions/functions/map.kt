package com.kaiobrunobm.higherorderfunctions.functions

import com.kaiobrunobm.higherorderfunctions.data.cookies

val fullMenu = cookies.map { cookie ->
    ("${cookie.name} - $${cookie.price}")
}

fun main() {
   println("Full menu:")
    fullMenu.forEach { item -> (
            println(item)
            ) }
}