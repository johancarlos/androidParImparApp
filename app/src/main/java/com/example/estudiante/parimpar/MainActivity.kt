package com.example.estudiante.parimpar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bntImpar.setOnClickListener({


            val aleatorrio = (1..10).shuffled().first()

            if(aleatorrio % 2 === 0 ){
                //correctos
                
            }
            else{
                //incorrectos
            }
        })
    }



    fun sumarCorrectos(){
        val numCorrect = 0
        numCorrect = numCorrect++
    }

    fun sumarIncorrectos(){
        val numCorrect = 0
        numCorrect = numCorrect++
    }

}
