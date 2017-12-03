package com.example.artem.oop.modal

/**
 * Created by Artem on 27.11.2017.
 */
open class Circle(var r:Double): Shape() {
    fun perimeter():Double {return 2*Math.PI*r}
    fun area():Double {return Math.PI*Math.pow(r, 2.0)}
}