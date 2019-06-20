//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//import kotlinx.coroutines.channels.*
//
//fun CoroutineScope.produceNumbers() = produce {
//    var x=1
//    while (true)
//        send(x++)
//}
//
//fun CoroutineScope.produceSquares(numbers:ReceiveChannel<Int>) = produce {
//    for (i in numbers)
//        send(i*i)
//}
//
//fun main() = runBlocking {
//
//    val numbers = produceNumbers()
//    val squares = produceSquares(numbers)
//    squares.consumeEach { println(it) }
//
//}