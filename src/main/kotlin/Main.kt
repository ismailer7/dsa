package com.dsa

import com.dsa.collection.ILinkedList
import com.dsa.collection.LinkedList

fun main() {
    println("*** LinkedList DSA ***")

    val myList: ILinkedList<String> = LinkedList<String>()

    myList.add("Kotlin")
    myList.add("Java")
    myList.add("Gradle")
    myList.add("Maven")
    myList.traverse()


    // ----

    myList.remove("Gradle")
    myList.traverse()
}