//import kotlinx.coroutines.*
//import kotlinx.coroutines.channels.*
//
//
//fun CoroutineScope.produceSquares(): ReceiveChannel<Int> = produce {
//    for (x in 1..5000)
//        send(x*x)
//}
//
//fun main() = runBlocking {
//
//    val squares = produceSquares()
//    squares.consumeEach { println(it) }
//    println("Done!")
//
//}