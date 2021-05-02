package com.wenchen.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.wenchen.myrecyclerview.adapter.ItemAdapter
import com.wenchen.myrecyclerview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myData = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)

        recyclerView.adapter = ItemAdapter(this, myData)
        recyclerView.setHasFixedSize(true)
    }
}