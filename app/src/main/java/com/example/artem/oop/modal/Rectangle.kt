package com.example.artem.oop.modal

/**
 * Created by Artem on 02.12.2017.
 */
class Rectangle(): Shape() {
    var x1:Double = 0.0
    var y1:Double = 0.0
    var x2:Double = 0.0
    var y2:Double = 0.0
    var a:Double = 0.0
    var b:Double = 0.0
    constructor(x1:Double, y1:Double, x2:Double, y2:Double):this(){
        this.x1 = x1
        this.y1 = y1
        this.x2 = x2
        this.y2 = y2
    }
    constructor(a:Double, b:Double):this(){
        this.a = a
        this.b = b
    }
    fun perimeter():Double{
        if(a != 0.0){
            return 2*(a+b)
        }else{
            a = Math.abs(y2 - y1)
            b = Math.abs(x2 - x1)
            return 2*(a+b)
        }
    }
    fun area():Double{
        if(a != 0.0){
            return a*b
        }else{
            a = Math.abs(y2 - y1)
            b = Math.abs(x2 - x1)
            return a*b
        }
    }
}