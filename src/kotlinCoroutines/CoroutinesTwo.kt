//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//    val job = GlobalScope.launch { // launch a new coroutine and keep
////                                    a reference to its Job
//        delay(4000L)
//        println("Coroutine Block: Printing after 2s delay")
//    }
//    println("Main thread will continue executing")
//    job.join() // wait until child coroutine completes
//
//    launch {
//        delay(2000)
//        println("Local Scope")
//    }
//    println("Main thread will continue executing")
//}