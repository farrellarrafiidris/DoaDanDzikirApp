package com.farrell.doadandzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.farrell.doadandzikirapp.R
import com.farrell.doadandzikirapp.adapter.DzikirDoaAdapter
import com.farrell.doadandzikirapp.databinding.ActivityDzikirSetiapSaatBinding
import com.farrell.doadandzikirapp.model.DataDzikirDoa

class DzikirSetiapSaatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDzikirSetiapSaatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirSetiapSaatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Setiap Saat"

        binding.apply {
            rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirSetiapSaatActivity)
            rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}