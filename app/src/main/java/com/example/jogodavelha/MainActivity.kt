package com.example.jogodavelha

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btClick(view: View) {
        val btSelecionado = view as Button
        var cellID = 0

        when(btSelecionado.id) {
            R.id.bu1 -> cellID = 1
            R.id.bu2 -> cellID = 2
            R.id.bu3 -> cellID = 3
            R.id.bu4 -> cellID = 4
            R.id.bu5 -> cellID = 5
            R.id.bu6 -> cellID = 6
            R.id.bu7 -> cellID = 7
            R.id.bu8 -> cellID = 8
            R.id.bu9 -> cellID = 9
        }

        //Toast.makeText(this,"ID: " + cellID,Toast.LENGTH_SHORT).show()
        playGame(cellID, btSelecionado)
    }

    //Arrays
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    //Turnos
    var activeplayer = 1

    fun playGame (cellID: Int, btSelecionado:Button) {
        if(activeplayer==1) {
            btSelecionado.text = "X"
            btSelecionado.setBackgroundColor(Color.GREEN)
            player1.add(cellID)
            activeplayer = 2
        }
        else {
            btSelecionado.text = "O"
            btSelecionado.setBackgroundColor(Color.MAGENTA)
            player2.add(cellID)
            activeplayer = 1
        }
        btSelecionado.isEnabled = false
        checkWinner()

    }

    fun checkWinner () {
        var winer = -1

        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winer = 2
        }
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winer = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winer = 2
        }
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winer = 2
        }
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winer = 2
        }
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winer = 2
        }
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winer = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winer = 2
        }
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winer = 2
        }
        if (player1.contains(7) && player1.contains(5) && player1.contains(3)) {
            winer = 1
        }
        if (player2.contains(7) && player2.contains(5) && player2.contains(3)) {
            winer = 2
        }

        //Vencedor
        if (winer != -1) {
            if (winer == 1) {
                Toast.makeText(this,"Player 1 Venceu!",Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this,"Player 2 Venceu!",Toast.LENGTH_SHORT).show()
            }
        }

    }
}