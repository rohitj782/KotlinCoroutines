//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//import kotlinx.coroutines.channels.consumeEach
//import kotlinx.coroutines.channels.produce
//
//fun CoroutineScope.generateResult() = produce {
//    for (i in 1..10)
//        send(i)
//}
//
//fun main() = runBlocking {
//    val myResult = generateResult()
//    myResult.consumeEach {
//        println(it)
//    }
//}