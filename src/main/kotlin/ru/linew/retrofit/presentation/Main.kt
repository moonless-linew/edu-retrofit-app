package ru.linew.retrofit.presentation

import ru.linew.retrofit.data.repository.AuthRepository

fun main(args: Array<String>) {
     AuthRepository().getToken().subscribe({
         println(it)
     }, {
        println(it)
     })
}


