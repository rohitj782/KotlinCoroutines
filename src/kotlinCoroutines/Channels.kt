//import kotlinx.coroutines.*
//import kotlinx.coroutines.channels.Channel
//
//fun main() = runBlocking{
//
//    val channel = Channel<Int>()
//    launch {
//        for(i in 1..50)
//            channel.send(i*i)   //sending via channel.
//        channel.close()  //closes channel i.e. we are done sending.
//    }
//
//    for (y in channel){    //retrieving values.
//        println(y)
//    }
//
//}