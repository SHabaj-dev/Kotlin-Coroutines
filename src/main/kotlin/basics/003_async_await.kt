package basics

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

/*
async — Returns Result

Use when you need a result from coroutine
 */

fun main() = runBlocking {
    val deferred = async {
        delay(5000.milliseconds)
        42
    }

    println("Waiting...")
    println(deferred.await())
}

/*
Returns Deferred<T>
Use .await() to get result
Runs in parallel
 */