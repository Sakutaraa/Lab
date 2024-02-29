package com.example.helloworld

import com.example.helloworld.myapp.Aquariums

fun main()
{
    buildAquarium()
}
fun buildAquarium(){
    val myAquariums = Aquariums()
    myAquariums.printSize()
}