package com.kaiobrunobm.higherorderfunctions.functions

import com.kaiobrunobm.higherorderfunctions.data.cookies


fun main() {

    cookies.forEach { cookie ->
        (println("Menu item: ${cookie.name}"))
    }
}
