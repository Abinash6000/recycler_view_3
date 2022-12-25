package com.project.recyclerview3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.project.recyclerview3.adapter.ItemAdapter
import com.project.recyclerview3.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        val myData = DataSource().loadItem()

        recyclerview.adapter = ItemAdapter(this, myData)

    }
}