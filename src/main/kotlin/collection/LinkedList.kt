package com.dsa.collection

class LinkedList<T>: ILinkedList<T> {

    private var firstNode: Node<T>? = null
    private var currentNode: Node<T>? = null




    override fun add(element: T) {
        if(firstNode != null) {
            val node: Node<T> = Node(element, null,  currentNode)
            currentNode?.next = node
            currentNode = node
        } else {
            firstNode = Node(element, null, null)
            currentNode = firstNode
        }
    }

    override fun remove(element: T) {
          currentNode = firstNode
        while(currentNode != null) {
            if(currentNode!!.value == element) {
                // remove the node
                currentNode!!.previous?.next = currentNode!!.next
                currentNode!!.next?.previous = currentNode!!.previous
                currentNode!!.next = null
                currentNode!!.previous = null
                break
            }
            currentNode = currentNode!!.next
        }
    }

    override fun traverse() {
        currentNode = firstNode
        while(currentNode != null) {
            print(currentNode!!.value)
            if(currentNode!!.next != null) print(" -> ")
            currentNode = currentNode!!.next
        }
        println()
    }

}