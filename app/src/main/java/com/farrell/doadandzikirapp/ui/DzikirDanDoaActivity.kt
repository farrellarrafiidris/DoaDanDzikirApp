package com.farrell.doadandzikirapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.farrell.doadandzikirapp.R
import com.farrell.doadandzikirapp.adapter.DzikirDoaAdapter
import com.farrell.doadandzikirapp.databinding.ActivityDzikirDanDoaBinding
import com.farrell.doadandzikirapp.model.DzikirDoaModel

class DzikirDanDoaActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirDanDoaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirDanDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir dan Doa Harian"

        binding.apply {
            rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirDanDoaActivity)
            rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(GetDzikirDoaHarian())
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

    fun GetDzikirDoaHarian(): ArrayList<DzikirDoaModel> {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val kumpulan = arrayListOf<DzikirDoaModel>()

        for (i in desc.indices) {
            var gabung = DzikirDoaModel(
                desc[i],
                lafaz[i],
                terjemah[i]
            )
            kumpulan.addAll(listOf(gabung))
        }
        return kumpulan
    }


}