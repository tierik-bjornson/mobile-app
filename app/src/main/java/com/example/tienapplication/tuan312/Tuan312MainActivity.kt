package com.example.tienapplication.tuan312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.tienapplication.R

class Tuan312MainActivity : AppCompatActivity() {
    var adap: Tuan312Adapter?=null
    var ls: ArrayList<Tuan312Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)
        var lv=findViewById<ListView>(R.id.tuan312lv)

        ls.add(Tuan312Contact("Nguyen van A","18",R.drawable.android))
        ls.add(Tuan312Contact("Nguyen van B","18",R.drawable.dell))
        ls.add(Tuan312Contact("Nguyen van c","29",R.drawable.hp))
        ls.add(Tuan312Contact("Nguyen van D","10",R.drawable.apple))

        adap=Tuan312Adapter(this,ls)
        lv.adapter=adap
    }
}