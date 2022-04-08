package com.example.otomotif.data

import android.annotation.SuppressLint
import com.example.otomotif.R
import com.example.otomotif.model.Affirmation

class Datasource {

    @SuppressLint("ResourceType")
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.gambar_1),
            Affirmation(R.string.affirmation2, R.drawable.gambar_2),
            Affirmation(R.string.affirmation3, R.drawable.gambar_3),
            Affirmation(R.string.affirmation4, R.drawable.gambar_4),
            Affirmation(R.string.affirmation5, R.drawable.gambar_5),
            Affirmation(R.string.affirmation6, R.drawable.gambar_6),
            Affirmation(R.string.affirmation7, R.drawable.gambar_7),
            Affirmation(R.string.affirmation8, R.drawable.gambar_8),
            Affirmation(R.string.affirmation9, R.drawable.gambar_9),
            Affirmation(R.string.affirmation10, R.drawable.gambar_10)
        )
    }
}