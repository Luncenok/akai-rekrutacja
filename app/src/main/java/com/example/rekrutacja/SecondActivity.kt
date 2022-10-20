package com.example.rekrutacja

import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import com.example.rekrutacja.databinding.ActivitySecondBinding
import com.example.rekrutacja.ext.toggleVisibility

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*      3. Poniżej znajduje się kod, który obsługuje kliknięcia dwóch przycisków,
                jednak na wyświetlającym się widoku nie są one podpisane. Twoim
                zadaniem jest wywnioskowanie co kliknięcie na poszczególny przycisk zmienia
                i adekwatne podpisanie tych przycisków w pliku activity_second.xml.
                Kolejne zadanie znajduje się poniżej.

                Podpisanie - chodzi o android:text.
         */

        binding.apply {
            firstButton.setOnClickListener {
                if (image.visibility == INVISIBLE) Toast.makeText(
                    applicationContext,
                    "obrazek jest już ukryty ;)",
                    LENGTH_SHORT
                ).show()
                else image.visibility = INVISIBLE //zmieniłem na visibility żeby nie przeskakiwało
            }
            secondButton.setOnClickListener {
                if (image.visibility == VISIBLE) Toast.makeText(
                    applicationContext,
                    "obrazek jest już widoczny ;)",
                    LENGTH_SHORT
                ).show()
                else image.visibility = VISIBLE
            }
            bothButton.setOnClickListener {
                image.toggleVisibility()
            }
            backButton.setOnClickListener {
                finish()
                overridePendingTransition(R.anim.fadein, R.anim.fadeout)
            }
        }

        /*      4. W tym activity znajduje się jeszcze jeden przycisk niestety kliknięcie
                na niego nic nie robi. Twoim zadaniem jest implementacja kliknięcia w taki sposób,
                aby jak obrazek jest widoczy przycisk chował obrazek, w przeciwnym wypadku,
                gdy obrazek jest schowany po kliknięciu obrazek ma się pojawić. Dodatkowo należy
                przerobić listenery poprzednich obrazków tak, aby np. Klikając na przycisk do chowania
                obrazka, chował on obrazek, a w przypadku kliknięcia, gdy obrazek jest niewidoczny
                wyświetlał informację o tym, obrazek jest już niewidoczny (np. za pomocą Toast lub
                SnackBar lub AlertDialog). Podobnie dla drugiego przycisku odpowiedzialnego za
                wyświetlanie obrazka. Jednocześnie zmień widok tego przycisku tak, aby nie wszystkie
                litery, były pisane wielką literą.
                Kolejne zadanie znajduje się poniżej.
         */

        /*      5. Ostatnie zadanie polega na dodaniu przycisku pozwalającego na przejście spowrotem
                do MainActivity. Tutaj jednak nie chcemy, abyś otwierał nowe activity, tylko po
                kliknięcku przycisku zamknął aktualne, ponieważ pod aktualnie wyświetlanym activity
                jest już instancja MainActivity.

         */

        /*      Zadanie Dodatkowe. Tutaj masz zupełną dowolność, jeśli masz jeszcze czas
                i ochotę zrób coś kreatywnego, ale jednocześnie prostego,
                pamiętaj jednak, aby nie naruszyć tym kodu,
                który realizuje poprzednich zadań. Nie jest to zadanie obowiązkowe.
         */
        /* Dodano:
        *  1. Animacja znikania i pojawiania się obrazków
        *  2. Klawiatura nie zasłania wpisywania i guzików
        *  3. Zaktualizowano biblioteki i target SDK do najnowszej wersji
        *  4. Migracja na MD3
        *  5. Zmiana kolorków do starszych androidów i dynamiczne kolory do nowych :)
        *  6. Animacje zmiany activity
        * */
    }
}
