package com.example.uicomponent

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.editNama)
        val gender = findViewById<RadioButton>(R.id.rb_Pria)

        val imgBtn = findViewById<ImageButton>(R.id.imgButtonAdd)
        imgBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Nama: ${nama.text},gender: ${gender.text} telah berhasil disimpan",
                    Toast.LENGTH_LONG).show()
        }
        val imgBtnDelete = findViewById<ImageButton>(R.id.imgButtonCancel)
        imgBtnDelete.setOnClickListener{nama.text.clear()}
    }
    fun onCbCLicked(view: View){
        val cbCoding = findViewById<CheckBox>(R.id.cbCoding)
        val cbReading = findViewById<CheckBox>(R.id.cbReading)
        val cbTraveling = findViewById<CheckBox>(R.id.cbTraveling)

        if (view is CheckBox) {
            val checked:Boolean = view.isChecked

            when (view.id) {
                R.id.cbCoding -> {
                    if (checked) {
                        Toast.makeText(applicationContext, "Anda memilih hobi ${cbCoding.text}",
                                Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "Anda membatalkan pilihan hobi ${cbCoding.text}",
                                Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.cbReading -> {
                    if (checked) {
                        Toast.makeText(applicationContext, "Anda memilih hobi ${cbReading.text}",
                                Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "Anda membatalkan pilihan hobi ${cbReading.text}",
                                Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.cbTraveling -> {
                    if (checked) {
                        Toast.makeText(applicationContext, "Anda memilih hobi ${cbTraveling.text}",
                                Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "Anda membatalkan pilihan hobi ${cbTraveling.text}",
                                Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

}



