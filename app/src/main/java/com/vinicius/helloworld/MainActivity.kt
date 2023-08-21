package com.vinicius.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vinicius.helloworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val resultado = binding.resultado

        binding.calcular.setOnClickListener {
            //captando as informações no "input" e tirando a média transformando string em int
            val notaUm = Integer.parseInt(binding.nota1.text.toString())
            val notaDois = Integer.parseInt(binding.nota2.text.toString())
            val media = (notaUm + notaDois)/2
            val faltas = Integer.parseInt(binding.faltas.text.toString())

            if (media >= 6 && faltas < 10) {
                resultado.setText("Aluno foi aprovado." + "\n" + "\n" + "Média: ${media}." + "\n" + "\n" + "Falta(s): ${faltas}.")
                resultado.setTextColor(Color.parseColor("#07F1D4"))

            }else {
                    resultado.setText("Aluno foi reprovado." + "\n" + "\n" + "Média: ${media}." + "\n" + "\n" + "Falta(s): ${faltas}.")
                    resultado.setTextColor(Color.RED)
            }
        }

    }
}