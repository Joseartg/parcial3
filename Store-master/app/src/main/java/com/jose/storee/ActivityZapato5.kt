package com.jose.storee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ActivityZapato5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapato5)
    }
    fun Buscar(Vista: View) {

        Toast.makeText(this,"Compra Exitosa", Toast.LENGTH_LONG).show()
    }


}