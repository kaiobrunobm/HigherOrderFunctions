package com.kaiobrunobm.higherorderfunctions.functions

import com.kaiobrunobm.higherorderfunctions.data.cookies

val groupedMenu = cookies.groupBy { it.softBaked }

val softBakedGroup  = groupedMenu[true] ?: listOf()
val crunchyGroup = groupedMenu[false] ?: listOf()

fun main () {
    println("Soft baked Menu:")
    softBakedGroup.forEach {
        println("${it.name} - $${it.price}")
    }
    println()
    println("Crunchy Menu:")
    crunchyGroup.forEach {
        println("${it.name} - $${it.price}")
    }
}