//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//
//    repeat(100_000){
//        launch {
//            doSomething()
//        }
//    }
//
//}
//
//suspend fun doSomething(){
//    delay(1000)
//    println(".")
//}