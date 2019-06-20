//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//import kotlin.system.measureTimeMillis
//
//fun main() = runBlocking {
//    //    val time = measureTimeMillis {
////        val one = doeSomethingOne()
////        val two = doeSomethingTwo()
////        println("The answer is ${one + two}")
////    }
////    println("Completed in $time ms")
//
//    //time taken is 2018 ms because this is sequential approach
//
//
//    val time = measureTimeMillis {
//        val one = async { doeSomethingOne() }
//        val two = async {  doeSomethingTwo()}
//        println("The answer is ${one.await() + two.await()}")
//    }
//    println("Completed in $time ms")
//    //Now time taken is less 1082 ms because this is async starts a light weight coroutine
//
//}
//
//suspend fun doeSomethingOne(): Int {
//    delay(1000)
//    return 1
//}
//
//
//suspend fun doeSomethingTwo(): Int {
//    delay(1000)
//    return 2
//}