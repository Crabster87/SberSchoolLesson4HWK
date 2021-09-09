package crabster.rudakov.sberschoollesson4hwk

/**
 * Запечатанный ласс, хранящий схемы для транслитераци
 *  */
sealed class TransliterationScheme {

    /**
     * Схема транслитераци с кириллицы на латиницу
     *  */
    class SchemeFromCyrillicToLatin {
        companion object {
            val map: Map<String, String> = mapOf(
                "А" to "A",  "Б" to "B",  "В" to "V",    "Г" to "G",
                "Д" to "D",  "Е" to "E",  "Ё" to "E",    "Ж" to "Zh",
                "З" to "Z",  "И" to "I",  "Й" to "I",    "К" to "K",
                "Л" to "L",  "М" to "M",  "Н" to "N",    "О" to "O",
                "П" to "P",  "Р" to "R",  "С" to "S",    "Т" to "T",
                "У" to "U",  "Ф" to "F",  "Х" to "KH",   "Ц" to "TS",
                "Ч" to "CH", "Ш" to "SH", "Щ" to "SHCH", "Ъ" to "IE",
                "Ы" to "Y",  "Ь" to "",   "Э" to "E",    "Ю" to "IU",
                "Я" to "IA", "а" to "a",  "б" to "b",    "в" to "v",
                "г" to "g",  "д" to "d",  "е" to "e",    "ё" to "e",
                "ж" to "zh", "з" to "z",  "и" to "i",    "й" to "i",
                "к" to "k",  "л" to "l",  "м" to "m",    "н" to "n",
                "о" to "o",  "п" to "p",  "р" to "r",    "с" to "s",
                "т" to "t",  "у" to "u",  "ф" to "f",    "х" to "kh",
                "ц" to "ts", "ч" to "ch", "ш" to "sh",   "щ" to "shch",
                "ъ" to "ie", "ы" to "y",  "ь" to "",     "э" to "e",
                "ю" to "iu", "я" to "ia",
            )
        }
    }

    /**
     * Схема транслитераци с латиницы на кириллицу
     *  */
    class SchemeFromLatinToCyrillic {
        companion object {
            val map: Map<String, String> = mapOf(
                "А" to "A", "B" to "Б",  "C" to "Ц", "D" to "Д",
                "E" to "Е", "F" to "Ф",  "G" to "Г", "H" to "Х",
                "I" to "И", "J" to "Ж",  "K" to "К", "L" to "Л",
                "M" to "М", "N" to "Н",  "O" to "О", "P" to "П",
                "Q" to "К", "R" to "Р",  "S" to "С", "T" to "Т",
                "U" to "У", "V" to "В",  "W" to "В", "X" to "КС",
                "Y" to "Й", "Z" to "З",  "a" to "а", "b" to "б",
                "c" to "ц", "d" to "д",  "e" to "е", "f" to "ф",
                "g" to "г", "h" to "х",  "i" to "и", "j" to "ж",
                "k" to "к", "l" to "л",  "m" to "м", "n" to "н",
                "o" to "о", "p" to "п",  "q" to "к", "r" to "р",
                "s" to "с", "t" to "т",  "u" to "у", "v" to "в",
                "w" to "в", "x" to "кс", "y" to "й", "z" to "з",
            )
        }
    }

}
