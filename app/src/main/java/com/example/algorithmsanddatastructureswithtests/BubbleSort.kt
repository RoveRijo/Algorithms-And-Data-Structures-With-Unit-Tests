package com.example.algorithmsanddatastructureswithtests

fun bubbleSort(arrayIn:Array<Int>):Array<Int>{
    fun swap(pos1:Int,pos2:Int){
        val temp = arrayIn[pos1]
        arrayIn[pos1] = arrayIn[pos2]
        arrayIn[pos2] = temp
    }
  for (i in 0 until arrayIn.size-1)
  {
      for(j in 0 until arrayIn.size-1-i){
          if(arrayIn[j]>arrayIn[j+1]) swap(j,j+1)
      }
  }
    return arrayIn
}

