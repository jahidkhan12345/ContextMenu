package com.example.contextmenu

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array= arrayOf("Red","Blue","Green","Black","Orange","Magenta","White","Violet","Yellow")
        val listView=findViewById<ListView>(R.id.listView)

        listView.adapter=ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,array)

        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menu?.add(0,v!!.id,0,"Item 1")
        menu?.add(0,v!!.id,0,"Item 2")
        menu?.add(0,v!!.id,0,"Item 3")
        menu?.add(0,v!!.id,0,"Item 4")

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.title){
            "Item 1"->{

                Toast.makeText(this, "Item 1 was Selected", Toast.LENGTH_SHORT).show()

            }

            "Item 2"->{

                Toast.makeText(this, "Item 2 was Selected", Toast.LENGTH_SHORT).show()


            }
            "Item 3"->{

                Toast.makeText(this, "Item 3 was Selected", Toast.LENGTH_SHORT).show()


            }
            "Item 4"->{

                Toast.makeText(this, "Item 4 was Selected", Toast.LENGTH_SHORT).show()


            }

        }
       return true
    }


}