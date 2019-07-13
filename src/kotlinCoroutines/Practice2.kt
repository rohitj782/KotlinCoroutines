//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//import kotlinx.coroutines.channels.Channel
//
//fun main() = runBlocking {
//
//    //channel is used to send a stream of data
//    val channel = Channel<Int>()
//    launch {
//        for(i in 1..10)
//            channel.send(i*i)
//        //closing the channel
//        channel.close()
//    }
//
//    //runs until the channel is closed
//    for(res in channel)
//        println(res)
//}