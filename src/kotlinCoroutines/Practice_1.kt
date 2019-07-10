//package kotlinCoroutines
//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking {//creates a coroutine scope
//
//    val job1 = launch { //launches a new coroutine scope
//        try {
//            var i = 0
//            while (isActive) {  //checks if the job is active or not
//                println("Hello $i")
//                i++
//                delay(180)
//            }
//            println("Job1 finishes")
//        } finally { //cancelling the job will throw cancellation exception
//            println("Hi, I'm finally!!!")
//        }
//    }
//    delay(1000) //suspends the current coroutine scope
//    println("Cancelling job1 after 1 sec")
//    job1.cancelAndJoin()    //cancel and join
//    println("Exiting...")
//}
//
