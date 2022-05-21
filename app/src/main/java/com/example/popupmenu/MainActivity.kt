package com.example.popupmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPop = findViewById<Button>(R.id.button) as Button
        val background = findViewById<LinearLayout>(R.id.back) as LinearLayout

        btnPop.setOnClickListener {
            val popMenu = PopupMenu(this@MainActivity,btnPop)
            popMenu.menuInflater.inflate(R.menu.menu_pop,popMenu.menu)
            popMenu.setOnMenuItemClickListener(object :PopupMenu.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?): Boolean {

                    when(item!!.itemId){
                        R.id.redColor->background.setBackgroundColor(Color.parseColor("#FF0000"))

                        R.id.greenColor->background.setBackgroundColor(Color.parseColor("#00FF00"))

                        R.id.blueColor->background.setBackgroundColor(Color.parseColor("#0000FF"))
                    }
                    return true
                }
            })
            popMenu.show()
        }
    }
}