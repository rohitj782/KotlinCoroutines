//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//
//    try {
//        withTimeoutOrNull(1200) {
//            repeat(200) {
//                println("Hello from the coroutines!!!")
//                delay(200)
//            }
//
//        }
//    }catch (e:TimeoutCancellationException){
//        e.printStackTrace()
//    }
//
//
////    withTimeoutOrNull
//
//    withTimeoutOrNull(1000){
//        repeat(200){
//            println("Kotlin -> $it")
//            delay(100)
//        }
//        println("Result is Success.")
//        System.exit(0)
//    }
//    println("Result is Failure.")
//
//}