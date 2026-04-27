package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*
runBlocking — Entry Point

- Starts a coroutine and blocks the current thread until it finishes.
 */

fun main() = runBlocking {
    println("Start")
    delay(5000)
    println("End")
}

/*
What is happening here:
Main thread is blocked
Coroutine runs inside it
Used mostly for:
 - testing
 - main functions
 - NOT recommended in production Android UI
 */