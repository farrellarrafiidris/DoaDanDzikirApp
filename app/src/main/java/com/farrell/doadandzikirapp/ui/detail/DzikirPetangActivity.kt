package com.farrell.doadandzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.farrell.doadandzikirapp.R
import com.farrell.doadandzikirapp.adapter.DzikirDoaAdapter
import com.farrell.doadandzikirapp.databinding.ActivityDzikirPetangBinding
import com.farrell.doadandzikirapp.model.DataDzikirDoa

class DzikirPetangActivity : AppCompatActivity() {

    lateinit var binding : ActivityDzikirPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Petang"

        binding.apply {
            rvDzikirPetang.layoutManager = LinearLayoutManager(this@DzikirPetangActivity)
            rvDzikirPetang.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
    }