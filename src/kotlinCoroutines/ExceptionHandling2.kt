//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//
////    using coroutineExceptionHandler
////    CoroutineExceptionHandler is invoked only on exceptions which are not expected to be handled by the user,
////    so registering it in async builder and the like of it has no effect.
//
//    val handler = CoroutineExceptionHandler { _, exception ->
//        println("Caught $exception")
//    }
//    val job = GlobalScope.launch(handler) {
//        throw AssertionError()
//    }
//    val deferred = GlobalScope.async(handler) {
//        throw ArithmeticException() // Nothing will be printed, relying on user to call deferred.await()
//    }
////    deferred.await()
//
//    val deferred1 = async {
//        delay (2000)
//        throw ArithmeticException() //throws exception causes application to crash.
//    }
//
//    joinAll(job, deferred, deferred1)
//
//}