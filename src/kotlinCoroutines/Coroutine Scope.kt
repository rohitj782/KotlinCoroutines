//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//
//class Activity : CoroutineScope by CoroutineScope(Dispatchers.Default) {
//
//    fun destroy() {
//        cancel() // Extension on CoroutineScope
//    }
//
//    // class Activity continues
//    fun doSomething() {
//        // launch ten coroutines for a demo, each working for a different time
//        repeat(10) { i ->
//            launch {
//                delay((i + 1) * 200L) // variable delay 200ms, 400ms, ... etc
//                println("Coroutine $i is done")
//            }
//        }
//    }
//} // class Activity ends
//
//fun main() = runBlocking<Unit> {
//    val activity = Activity()
//    activity.doSomething() // run test function
//    println("Launched coroutines")
//    delay(500L) // delay for half a second
//    println("Destroying activity!")
//    activity.destroy() // cancels all coroutines
//    delay(1000) // visually confirm that they don't work
//}