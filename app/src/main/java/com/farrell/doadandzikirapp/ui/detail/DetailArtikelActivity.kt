package com.farrell.doadandzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bumptech.glide.Glide
import com.farrell.doadandzikirapp.R
import com.farrell.doadandzikirapp.databinding.ActivityDetailArtikelBinding
import com.farrell.doadandzikirapp.model.ArtikelModel

class DetailArtikelActivity : AppCompatActivity() {

    lateinit var binding : ActivityDetailArtikelBinding
    companion object{
        const val DETAIL_DESC  = "detail_desc"
        const val DETAIL_TITLE = "detail_title"
        const val DETAIL_IMAGE = "detail_image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailArtikelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val desc = intent.getStringExtra(DETAIL_DESC)
        val title = intent.getStringExtra(DETAIL_TITLE)
        val image = intent.getIntExtra(DETAIL_IMAGE,0)

        binding.apply {
            tvDetailTitle.text  = title
            tvDetailDesc.text   = desc

            Glide.with(this@DetailArtikelActivity)
                .load(image)
                .into(imgDetail)
        }


    }
}