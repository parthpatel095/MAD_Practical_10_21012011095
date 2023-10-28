package com.example.mad_practical_10_21012011095

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PersonAdeptor
    ( context:Context,val personArray:ArrayList<Person>):ArrayAdapter<Person>(context,0,personArray){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

         val View=LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)
val contact=getItem(position)
        View.findViewById<TextView>(R.id.tv_layout_1).text=personArray[position].name
        View.findViewById<TextView>(R.id.tv_layout_2).text=personArray[position].phoneNo
        View.findViewById<TextView>(R.id.tv_layout_3).text=personArray[position].Email
        View.findViewById<TextView>(R.id.tv_layout_4).text=personArray[position].address

        Intent(context, MapsActivity::class.java).putExtra("object",personArray[position]).apply { context.startActivity(this) }

        return View
    }
    }
