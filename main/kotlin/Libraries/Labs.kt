package Libraries

import kotlin.random.Random as ktRan
import java.util.Random

        var jScore:Int =0
        var kScore:Int = 0

    fun main()
    {
//        var jRan = Random()
//        var kRan = ktRan.nextInt()
//        for(i in 1..1000)
//        {
//            bigger(jRan.nextInt(), kRan)
//        }
//
//        println("The final score is - Java - $jScore and Kotlin - $kScore")

    //    println(doubled(5))

   //     println(compile(3))

        println(totalLength(listOf("Hello", "World", "How", "Are", "You")))


        return
    }

//this function checks for the biggest of 2 numbers
    fun bigger(j:Int,k:Int)
    {
        if(j>k)
        {
            jScore+=1
        }else{
            kScore+=1

        }


    }

//A lamda functions
    val doubled: (Int) -> Int = { x -> x * 2 }// doubles the given number

    val capturedInt: Int = 11 // just passes 11 to the integer
    val addSomething = {i:Int -> i + capturedInt} // calls a function and adds the number passed to the result
//function that returns a function
        val compile = {i: Int -> doubled(addSomething(i))}


fun totalLength(strings : List<String>) : Int =





