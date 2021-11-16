package com.stups.agecalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calculate_age.setOnClickListener {

            val userAge = et_age.text.toString().trim()

            val year: Int = Calendar.getInstance().get(Calendar.YEAR)

            if (userAge == ""){
                Toast.makeText(this, "Silahkan masukkan tahun", Toast.LENGTH_SHORT).show()

            } else if (userAge > year.toString()){
                Toast.makeText(this, "Tahun yang dimasukkan harus kurang dari tahun sekarang", Toast.LENGTH_SHORT).show()

            } else {
             val age = year - userAge.toInt()

             tv_age.text = "Umur " +age+ " tahun"
            }
        }
    }
}