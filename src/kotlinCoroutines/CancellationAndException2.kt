//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//
//    val handler = CoroutineExceptionHandler { _, exception ->
//        println("Caught $exception")
//    }
//
//    val job = GlobalScope.launch(handler) {
//        launch { // the first child
//            try {
//                delay(Long.MAX_VALUE)
//            } finally {
//                withContext(NonCancellable) {
//                    println("Children are cancelled, but exception is not handled until all children terminate")
//                    delay(100)
//                    println("The first child finished its non cancellable block")
//                }
//            }
//        }
//        launch { // the second child
//            delay(10)
//            println("Second child throws an exception")
//            throw ArithmeticException()
//        }
//    }
//    job.join()
//}