package com.ashehata.circle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpListeners()
    }

    private fun setUpListeners() {
        btn_delete.setOnClickListener {
            et_radius.setText("")
            tv_area.text = ""
        }

        btn_calculate.setOnClickListener {
            val radius = et_radius.text.toString().trim().toIntOrNull()

            if (radius != null) {
                val area = with(Math.PI * radius.pow()) {
                    return@with this.toString()
                }
                tv_area.text = area
            }

        }
    }

    fun Int.pow(num: Int = 2): Double {
        return this.toDouble().pow(num)
    }
}