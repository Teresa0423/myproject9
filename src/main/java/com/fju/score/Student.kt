package com.fju.com.fju.score

class Student (var name:String,var english:Int,var math:Int){
    /*fun print(){
        println(name+"\t"+english+"\t"+math+"\t")
    }*/
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}") //無法直接拿取的資料要${}
    }
    fun getAverage() = (english+math)/2
}

fun main(){
    val stu = Student("Jack",50,80)
    stu.print()
}