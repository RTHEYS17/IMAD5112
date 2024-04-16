package com.example.thehistoryapp

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val editText = findViewById<EditText>(R.id.txtNumber)

        btnGenerate.setOnClickListener {
            eventHandler()
            hideKeyboard(this, editText)
        }

        val btnClear = findViewById<Button>(R.id.btnClear)

        btnClear.setOnClickListener {
            clearText(editText)
        }
    }

    private fun eventHandler() {
        val txtNumber = findViewById<EditText>(R.id.txtNumber)
        val numberText = txtNumber.text.toString().trim()
        val txtResponse = findViewById<EditText>(R.id.txtResponse)

        try {
            val number = numberText.toInt()
            txtResponse.setText(getMessage(number))
        } catch (e: NumberFormatException) {
            // Handle the case where numberText does not contain a valid integer
            txtResponse.setText("Invalid input. Please enter a valid integer.")
        }
    }

    private fun clearText(editText: EditText) {
        editText.setText("")
    }

    private fun getMessage(myNum: Int): String {
        return when (myNum) {
            19  -> "Congrats you are the same age as Joan of Arc"
            20  -> "Congrats you are the same age as Galileo Galilei"
            21  -> "Congrats you are the same age as Sir Isaac Brock"
            22  -> "Congrats you are the same age as Ludwig van Beethoven"
            23  -> "Congrats you are the same age as George Washington"
            24  -> "Congrats you are the same age as Helen Keller"
            25  -> "Congrats you are the same age as Thomas Jefferson"
            26  -> "Congrats you are the same age as Marie Curie"
            27  -> "Congrats you are the same age as Pablo Picasso"
            28  -> "Congrats you are the same age as Wolfgang Amadeus Mozart"
            29  -> "Congrats you are the same age as Napoleon Bonaparte"
            30  -> "Congrats you are the same age as Queen Victoria"
            31  -> "Congrats you are the same age as Charles Darwin"
            32  -> "Congrats you are the same age as Alexander the Great"
            33  -> "Congrats you are the same age as Florence Nightingale"
            34  -> "Congrats you are the same age as Abraham Lincoln"
            35  -> "Congrats you are the same age as Mark Twain"
            36  -> "Congrats you are the same age as Marilyn Monroe"
            37  -> "Congrats you are the same age as Walt Disney"
            38  -> "Congrats you are the same age as Albert Einstein"
            39  -> "Congrats you are the same age as Cleopatra"
            40  -> "Congrats you are the same age as Martin Luther King Jr."
            41  -> "Congrats you are the same age as J.R.R. Tolkien"
            42  -> "Congrats you are the same age as Winston Churchill"
            43  -> "Congrats you are the same age as Mother Teresa"
            44  -> "Congrats you are the same age as Neil Armstrong"
            46  -> "Congrats you are the same age as Martin Luther King Jr."
            47  -> "Congrats you are the same age as Steve Jobs"
            48  -> "Congrats you are the same age as Stephen Hawking"
            49  -> "Congrats you are the same age as Elvis Presley"
            50  -> "Congrats you are the same age as John F. Kennedy"
            51  -> "Congrats you are the same age as Muhammad Ali"
            52  -> "Congrats you are the same age as Napoleon Bonaparte"
            53  -> "Congrats you are the same age as William Shakespeare"
            54  -> "Congrats you are the same age as Bill Gates"
            55  -> "Congrats you are the same age as Michael Jackson"
            56  -> "Congrats you are the same age as Abraham Lincoln"
            57  -> "Congrats you are the same age as Adolf Hitler"
            58  -> "Congrats you are the same age asJulius Caesar"
            59  -> "Congrats you are the same age as Barack Obama"
            60  -> "Congrats you are the same age as David Bowie"
            61  -> "Congrats you are the same age as Dalai Lama"
            62  -> "Congrats you are the same age as Stephen King"
            63  -> "Congrats you are the same age asMarco Polo"
            64  -> "Congrats you are the same age as Bill Clinton"
            65  -> "Congrats you are the same age asGenghis Khan"
            66  -> "Congrats you are the same age as George Clooney"
            67  -> "Congrats you are the same age asLeonardo da Vinci"
            68  -> "Congrats you are the same age as Tom Hanks"
            69  -> "Congrats you are the same age Queen Elizabeth I"
            70  -> "Congrats you are the same age as Arnold Schwarzenegger"
            71  -> "Congrats you are the same age as Hillary Clinton"
            72  -> "Congrats you are the same age as Bruce Lee"
            73  -> "Congrats you are the same age as J.K. Rowling"
            74  -> "Congrats you are the same age as Queen Elizabeth II"
            75  -> "Congrats you are the same age as Paul McCartney"
            76  -> "Congrats you are the same age Albert Einstein"
            77  -> "Congrats you are the same age as Tiger Woods"
            78  -> "Congrats you are the same age Mahatma Gandhi"
            79  -> "Congrats you are the same age as Tom Cruise"
            80  -> "Congrats you are the same age as Sylvester Stallone"
            81  -> "Congrats you are the same age as Meryl Streep"
            82  -> "Congrats you are the same age as Tommy Lee Jones"
            83  -> "Congrats you are the same age Isaac Newton"
            84  -> "Congrats you are the same age Thomas Edison"
            85  -> "Congrats you are the same age as Clint Eastwood"
            86  -> "Congrats you are the same age as Robert De Niro"
            87  -> "Congrats you are the same age as Jack Nicholson"
            88  -> "Congrats you are the same age as Sean Connery"
            89  -> "Congrats you are the same age as Betty White"
            91  -> "Congrats you are the same age as Kirk Douglas"
            92  -> "Congrats you are the same age as Queen Elizabeth The Queen Mother"
            93  -> "Congrats you are the same age as Dick Van Dyke"
            94  -> "Congrats you are the same age as Prince Philip, Duke of Edinburgh"
            90  -> "Congrats you are the same age Winston Churchill"
            95  -> "Congrats you are the same age Nelson Mandela"
            96  -> "Congrats you are the same age as Olivia de Havilland"
            97  -> "Congrats you are the same age as Kirk Douglas"
            98  -> "Congrats you are the same age as Queen Lizzy"
            99  -> "Congrats you are the same age as Betty White"
            100 ->"Congrats you are the same age as Kirk Douglas"
            else -> " number is either to high or low please enter a number between 18 and 101"
        }
    }

    private fun hideKeyboard(context: Context, editText: EditText) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(editText.windowToken, 0)
    }
}
