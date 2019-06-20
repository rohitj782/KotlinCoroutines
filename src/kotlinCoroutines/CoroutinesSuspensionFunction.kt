//
//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//
//    launch {
//        doSomething()
//    }
//
//    println("Run Blocking...")
//
//    coroutineScope {
//     launch {
//         doSomething()
//     }
//        println("Coroutine Scope")
//    }
//
//    println("Run Blocking...")
//}
//
// suspend fun doSomething(){
//     delay(2000)
//    println("Suspension Fun Called")
//}
//
