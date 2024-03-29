package com.example.algoritms.easy

fun main() {
    val intArray = IntArray(5)
    intArray[0] = 1
    intArray[1] = 2
    intArray[2] = 1
    intArray[3] = 3
    intArray[4] = 3

    println(singleNumber(intArray))
}

fun singleNumber(nums: IntArray): Int {
    var singleNumber = 0
    for (i in nums) {
        singleNumber = i.xor(singleNumber)
    }
    return singleNumber
}
