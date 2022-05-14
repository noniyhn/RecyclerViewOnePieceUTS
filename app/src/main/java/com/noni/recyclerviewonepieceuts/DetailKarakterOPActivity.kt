package com.noni.recyclerviewonepieceuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailKarakterOPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_karakter_opactivity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val karakterop = intent.getParcelableExtra<KarakterOP>(MainActivity.INTENT_PARCELABLE)

        val imgKarakterOP = findViewById<ImageView>(R.id.img_item_photo)
        val nameKarakterOP = findViewById<TextView>(R.id.tv_item_name)
        val descKarakterOP = findViewById<TextView>(R.id.tv_item_description)

        imgKarakterOP.setImageResource(karakterop?.imgKarakterOP!!)
        nameKarakterOP.text = karakterop.nameKarakterOP
        descKarakterOP.text = karakterop.descKarakterOP
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}