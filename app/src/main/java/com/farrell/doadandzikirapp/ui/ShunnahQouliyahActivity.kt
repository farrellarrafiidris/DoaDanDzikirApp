package com.farrell.doadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.farrell.doadandzikirapp.R
import com.farrell.doadandzikirapp.adapter.DzikirDoaAdapter
import com.farrell.doadandzikirapp.databinding.ActivityShunnahQouliyahBinding
import com.farrell.doadandzikirapp.model.DataDzikirDoa

class ShunnahQouliyahActivity : AppCompatActivity() {

    lateinit var binding : ActivityShunnahQouliyahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShunnahQouliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah - Sunnah Qouliyah"

        binding.apply {
            rvQauliyahShalat.layoutManager = LinearLayoutManager(this@ShunnahQouliyahActivity)
            rvQauliyahShalat.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)

        }



    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

}