package com.example.mytodo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private var index = 0
    private var myStringArray = mutableListOf("test$index")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun AddMessage(view: View)
    {
        index++
        myStringArray.add("test$index")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myStringArray)
        val listView: ListView = findViewById(R.id.myListView)

        listView.adapter = adapter
    }
}
