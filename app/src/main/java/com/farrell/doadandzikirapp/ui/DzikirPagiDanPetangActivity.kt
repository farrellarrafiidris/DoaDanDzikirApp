package com.farrell.doadandzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.farrell.doadandzikirapp.R

import com.farrell.doadandzikirapp.databinding.ActivityDzikirPagiDanPetangBinding
import com.farrell.doadandzikirapp.ui.detail.DzikirPagiActivity
import com.farrell.doadandzikirapp.ui.detail.DzikirPetangActivity


class DzikirPagiDanPetangActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityDzikirPagiDanPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiDanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView()
    }

    private fun setView() {
        //setup view artikel
        binding.apply {
            imgBtnDzikirPagi.setOnClickListener(this@DzikirPagiDanPetangActivity)
            imgBtnDzikirPetang.setOnClickListener(this@DzikirPagiDanPetangActivity)
        }


    }

    override fun onClick(v: View?) {
        when(v?. id){
            R.id.img_btn_dzikir_pagi -> {
                val intentPA = Intent(this@DzikirPagiDanPetangActivity,DzikirPagiActivity::class.java)
                startActivity(intentPA)
            }
            R.id.img_btn_dzikir_petang -> {
                val intentPE = Intent(this@DzikirPagiDanPetangActivity,DzikirPetangActivity::class.java)
                startActivity(intentPE)
            }
        }
    }
}