package com.example.repasoam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.text.split as text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var listV = mutableListOf<String>("a", "A", "e", "E", "i", "I", "o", "O", "u", "U")
        var listaF = mutableListOf<String>("")
        var listaInvertida = mutableListOf<String>("")
        var TextoaMostrar = ""
        val pal = intent.getStringExtra(MainActivity.ex)

        pal?.let {
            listaF = pal.text(",").toMutableList()
            listaF.forEach {
                TextoaMostrar += (it + "\n")
            }
        }
        textviewlista.setText(TextoaMostrar)


        Dar.setOnClickListener{
            listaF.forEach {
                TextoaMostrar += (it + " "+it.length+"\n")
            }
            textviewlista.setText(TextoaMostrar)
        }

        Fil.setOnClickListener{
            var cantidad=et2.text

            listaF.forEach {
                if (it.length.compareTo(cantidad)) {


                }

            }

            
        }

//        Dup.setOnClickListener {
//
//            listaF.forEach {
//                for (j in listaF[it.toInt()]) {
//                    if (j in listV)
//                        listaF.add(
//                            listaF[it.toInt()][(j + 1).toInt()].toInt(),
//                            listaF[it.toInt()][j.toInt()].toString()
//                        )
//                }
//
//                TextoaMostrar = TextoaMostrar + (it + "\n")
//            }
//            textviewlista.setText(TextoaMostrar)
//        }
//
//
//        Inv.setOnClickListener {
//
//            var j = listaF.lastIndex
//
//            listaF.forEach {
//
//                listaInvertida[j] == it
//
//                j = j - 1
//            }
//            listaInvertida.forEach {
//                TextoaMostrar = TextoaMostrar + (it + "\n")
//            }
//            textviewlista.setText(TextoaMostrar)
//        }
//        Ree.setOnClickListener {
//            listaF.forEach {
//                it.forEach { it2 ->
//                    if (it2.equals(et2.text)) {
//                        it2.equals(":)")
//                    } else {
//                        listaF.remove(it)
//                    }
//
//                }
//
//            }
//            listaF.forEach {
//                TextoaMostrar = TextoaMostrar + (it + "\n")
//            }
//            textviewlista.setText(TextoaMostrar)

    }
}


