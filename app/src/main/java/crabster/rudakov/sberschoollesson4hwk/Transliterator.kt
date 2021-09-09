package crabster.rudakov.sberschoollesson4hwk

import java.lang.StringBuilder

/**
 * Класс, реализующий логику транслитерации
 * @param text текст из TextInputEditText View
 * @param translationScheme схема транслитерации
 *  */
class Transliterator(private val text: String, private val translationScheme: Map<String, String>) {

    fun translate(): String {
        val sb = StringBuilder(text.length)
        for (i in text.indices) {
            val litter = text.substring(i, i + 1)
            if (translationScheme.containsKey(litter)) {
                sb.append(translationScheme[litter])
            } else {
                sb.append(litter)
            }
        }
        return sb.toString()
    }

}