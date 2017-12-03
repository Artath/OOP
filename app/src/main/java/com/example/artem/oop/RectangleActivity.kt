package com.example.artem.oop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.artem.oop.modal.Rectangle
import kotlinx.android.synthetic.main.activity_rectangle.*

class RectangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        calc_btn.setOnClickListener(View.OnClickListener {


            var newRectangle = if(sideA_editText.text.toString().isNotEmpty()){
                val a = sideA_editText.text.toString().toDouble()
                val b = sideB_editText.text.toString().toDouble()
                Rectangle(a, b)

            }else {
                val x1 = x1_editText.text.toString().toDouble()
                val y1 = y1_editText.text.toString().toDouble()
                val x2 = x2_editText.text.toString().toDouble()
                val y2 = y2_editText.text.toString().toDouble()
                Rectangle(x1, y1, x2, y2)
            }
            perimeter_result_txt.text = newRectangle.perimeter().toString()
            area_result_txt.text = newRectangle.area().toString()


        })
    }
}
