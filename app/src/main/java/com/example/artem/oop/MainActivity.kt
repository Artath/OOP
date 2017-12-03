package com.example.artem.oop

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    var startIntent = Intent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, resources.getStringArray(R.array.shapes))
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when(spinner.selectedItemPosition){
                    0 -> startIntent = Intent(applicationContext, CircleActivity::class.java)
                    1 -> startIntent = Intent(applicationContext, RectangleActivity::class.java)
                    2 -> startIntent = Intent(applicationContext, TriangleActivity::class.java)
                }
                //Toast.makeText(this@MainActivity, "You have Selected " + spinner.selectedItemPosition.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        var button = findViewById<Button>(R.id.start_button)
        button.setOnClickListener(View.OnClickListener {startActivity(startIntent)})
    }
}
