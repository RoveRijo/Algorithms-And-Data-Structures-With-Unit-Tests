package com.example.algorithmsanddatastructureswithtests

fun quickSort(arrayIn: Array<Int>): Array<Int> {
    fun swap(pos1: Int, pos2: Int) {
        val temp = arrayIn[pos1]
        arrayIn[pos1] = arrayIn[pos2]
        arrayIn[pos2] = temp
    }

    fun partition(low: Int, high: Int): Int {
        val pivot = arrayIn[high]
        var i = low - 1
        for (j in low until high) {
            if (arrayIn[j] <= pivot) {
                i++
                swap(i, j)
            }
        }
        swap(i + 1, high)
        return i + 1
    }

    fun sort(low: Int, high: Int) {
        if(low<high) {
            val pivotIndex = partition(low, high)
            sort(low, pivotIndex - 1)
            sort(pivotIndex + 1, high)
        }
    }


    sort(0, arrayIn.size - 1)
    return arrayIn
}