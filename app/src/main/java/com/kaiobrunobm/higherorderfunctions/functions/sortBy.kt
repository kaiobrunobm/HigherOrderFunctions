package com.kaiobrunobm.higherorderfunctions.functions

import com.kaiobrunobm.higherorderfunctions.data.cookies

fun main () {
    val alphabeticMenu = cookies.sortedBy {
        it.name
    }

    println("Alphabetic Menu:")
    alphabeticMenu.forEach {
        println(it.name)
    }
}