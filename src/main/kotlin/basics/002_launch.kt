package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

/*
launch - Fire & Forget

Starts a coroutine that does not return a result
 */

fun main() = runBlocking {

    println("Start")
    launch {
        delay(3000L.milliseconds)
        println("World!")
    }

    println("Hello,")

}

/*
Runs concurrently
Returns a Job
You don’t get a result back
 */