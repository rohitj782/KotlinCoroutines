////package kotlinCoroutines
////
////import kotlinx.coroutines.async
////import kotlinx.coroutines.runBlocking
////
////fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
////
////fun main() = runBlocking<Unit> {
////    //sampleStart
////    val a = async {
////        log("I'm computing a piece of the answer")
////        6
////    }
////    val b = async {
////        log("I'm computing another piece of the answer")
////        7
////    }
////    log("The answer is ${a.await() * b.await()}")
//////sampleEnd
////}
//
//import kotlinx.coroutines.*
//
//fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
//
//fun main() = runBlocking(CoroutineName("main")) {
//    log("Started main coroutine")
//    // run two background value computations
//    val v1 = async(CoroutineName("v1coroutine")) {
//        delay(500)
//        log("Computing v1")
//        252
//    }
//    val v2 = async(CoroutineName("v2coroutine")) {
//        delay(1000)
//        log("Computing v2")
//        6
//    }
//    log("The answer for v1 / v2 = ${v1.await() / v2.await()}")
//}