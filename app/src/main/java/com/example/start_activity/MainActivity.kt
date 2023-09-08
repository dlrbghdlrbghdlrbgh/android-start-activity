package com.example.start_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.start_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // binding 변수 선언
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)

        binding.execute.setOnClickListener {
            val intent = Intent(this, ReceiveActivity::class.java)

            /**
             * intent에 키가 name 이고 value는 본인의 이름인 데이터를 넘기세요
             */

            startActivity(intent)
        }

    }
}