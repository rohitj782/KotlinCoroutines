//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//import kotlin.system.measureTimeMillis
//
//fun main() = runBlocking {
//
//    var time = measureTimeMillis {
//        val one = async (start = CoroutineStart.LAZY) { one() }
//        val two = async (start = CoroutineStart.LAZY) { two() }
//        val three = async (start = CoroutineStart.LAZY) { three() }
//        one.start()
//        two.start()
//        println(one.await() + two.await() + three.await())
//    }
//    println(time)
//}
//
//suspend fun one(): Int {
//    delay(1000)
//    return 1
//}
//
//suspend fun two(): Int {
//    delay(1000)
//    return 2
//}
//
//suspend fun three(): Int {
//    delay(1000)
//    return 3
//}