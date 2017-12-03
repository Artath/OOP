package com.example.artem.oop.modal

/**
 * Created by Artem on 02.12.2017.
 */
class Triangle(var a:Double, var b:Double, var c:Double): Shape() {
    fun perimeter():Double{return a+b+c}
    fun area():Double{
        var p = perimeter()/2
        return Math.sqrt(p*(p-a)*(p-b)*(p-c))
    }
}