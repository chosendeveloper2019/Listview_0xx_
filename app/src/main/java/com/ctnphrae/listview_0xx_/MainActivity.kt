package com.ctnphrae.listview_0xx_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("กระเพราไก่ไข่ดาว"
                            ,"กระเพราหมูกรอบไข่ดาว"
                            ,"พะแนง"
                            ,"ยำกุ้งสด")

    val priceArr = arrayOf(50,50,300,150)

    val context = this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_RESULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("เมนูอาหาร")

        val mAdp = ArrayAdapter(context,
                            android.R.layout.simple_list_item_1,
                            titleArr)

        lv_result.adapter = mAdp

        lv_result.setOnItemClickListener { parent, view, position, id ->

//            Toast.makeText(context,
//                " ชื่ออาหาร  ${titleArr[position]} ราคา ${priceArr[position]} บาท"
//                ,Toast.LENGTH_LONG).show()
            val goPageResult = Intent(context,ResultActivity::class.java)

            goPageResult.putExtra(KEY_TITLE,titleArr[position])
            goPageResult.putExtra(KEY_RESULT,priceArr[position])

            startActivity(goPageResult)


        }
    }
}
