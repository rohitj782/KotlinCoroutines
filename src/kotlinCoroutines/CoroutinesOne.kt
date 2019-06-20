
//import kotlinx.coroutines.*
//
//fun main(){
//
//    GlobalScope.launch {    //creates a new Coroutine  block
//        delay(2000) //suspension function
//        println("Coroutine Block: Printing after 2s delay")
//    }
//
//    println("No delay")
//
//    runBlocking {   //blocks main thread
//        delay(3000)
//        println("Printing after blocking main thread for 3s")
//
//    }
//}