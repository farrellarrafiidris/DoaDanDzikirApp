package com.farrell.doadandzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.farrell.doadandzikirapp.R
import com.farrell.doadandzikirapp.adapter.DzikirDoaAdapter
import com.farrell.doadandzikirapp.databinding.ActivityDzikirPagiBinding
import com.farrell.doadandzikirapp.model.DataDzikirDoa

class DzikirPagiActivity : AppCompatActivity() {

    lateinit var binding : ActivityDzikirPagiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi"

        binding.apply {
            rvDzikirPagi.layoutManager = LinearLayoutManager(this@DzikirPagiActivity)
            rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}
