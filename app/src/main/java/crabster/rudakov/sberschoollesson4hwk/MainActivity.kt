package crabster.rudakov.sberschoollesson4hwk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTextCyrillic: TextInputEditText = findViewById(R.id.edit_text_cyrillic)
        val editTextLatin: TextInputEditText = findViewById(R.id.edit_text_latin)

        val buttonTransformCyrillic: MaterialButton = findViewById(R.id.button_transform_cyrillic)
        buttonTransformCyrillic.setOnClickListener {
            val text: String = editTextCyrillic.text.toString()
            val translator = Transliterator(text, TransliterationScheme.SchemeFromCyrillicToLatin.map)
            editTextLatin.setText(translator.translate())
        }

        val buttonTransformLatin: MaterialButton = findViewById(R.id.button_transform_latin)
        buttonTransformLatin.setOnClickListener {
            val text: String = editTextLatin.text.toString()
            val translator = Transliterator(text, TransliterationScheme.SchemeFromLatinToCyrillic.map)
            editTextCyrillic.setText(translator.translate())
        }

    }

}