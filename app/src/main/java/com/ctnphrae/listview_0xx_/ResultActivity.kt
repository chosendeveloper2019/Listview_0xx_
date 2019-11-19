package com.ctnphrae.listview_0xx_

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val title = intent.extras?.getString(MainActivity().KEY_TITLE,"")
        val result = intent.extras?.getInt(MainActivity().KEY_RESULT)

        tv_title.setText(title)
        tv_result.setText("${result}")

        btn_back.setOnClickListener {

            finish()

        }


    }

}