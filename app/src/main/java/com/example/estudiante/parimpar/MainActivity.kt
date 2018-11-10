package com.example.estudiante.parimpar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bntImpar.setOnClickListener({

            var scorrect = 0
            var sincorrect = 0
            var aleatorio = (1..10).shuffled().first()

            numlabel

            if(aleatorio % 2 === 0 ){
                //correctos
                scorrect = scorrect + 1
                correctos.text = scorrect.toString()

            }
            else{
                //incorrectos
                sincorrect = sincorrect + 1
                incorrectos.text = sincorrect.toString()

            }
        })
    }

}
