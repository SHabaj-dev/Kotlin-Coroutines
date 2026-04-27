package basics

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

/*
suspend — Pause Without Blocking

Marks a function that can be paused
 */

fun main() = runBlocking {
    println("Fetching user Data")
    val userData = getData()
    println(userData)

}

suspend fun getData(): String {
    delay(6000.milliseconds)
    return "user Date fetched from server"
}

/*
Can ONLY be called from:

another suspend function
or coroutine
 */