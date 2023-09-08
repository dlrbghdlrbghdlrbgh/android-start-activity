package com.example.start_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.start_activity.databinding.ActivityMainBinding
import com.example.start_activity.databinding.ActivityReceiveBinding

class ReceiveActivity : AppCompatActivity() {

    // binding 변수 선언
    private lateinit var binding: ActivityReceiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_receive)

        /**
         * intent를 통해 받은 데이터를 receive_message에 입력하는 코드들 작성하세요
         */
    }
}