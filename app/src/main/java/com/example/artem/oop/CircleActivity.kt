package com.example.artem.oop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_circle.*
import com.example.artem.oop.modal.*
import kotlin.*

class CircleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        calc_btn.setOnClickListener(View.OnClickListener {
            var newCircle = Circle(radius_editText.text.toString().toDouble())
            perimeter_result_txt.text = newCircle.perimeter().toString()
            area_result_txt.text = newCircle.area().toString()
        })
    }
}

