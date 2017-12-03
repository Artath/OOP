package com.example.artem.oop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.artem.oop.modal.*
import kotlinx.android.synthetic.main.activity_triangle.*

class TriangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)


        calc_btn.setOnClickListener(View.OnClickListener {
            val a = sideA_editText.text.toString().toDouble()
            val b = sideB_editText.text.toString().toDouble()
            val c = sideC_editText.text.toString().toDouble()
            val newTriangle = Triangle(a, b, c)
            perimeter_result_txt.text = newTriangle.perimeter().toString()
            area_result_txt.text = newTriangle.area().toString()
        })

    }
}
