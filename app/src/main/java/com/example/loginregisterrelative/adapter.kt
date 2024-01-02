package com.example.loginregisterrelative

import android.annotation.SuppressLint
import com.example.loginregisterrelative.R
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class adapter (private val context: Activity,
                     private val arrayList: ArrayList<datauy>) : ArrayAdapter<datauy>(context,
    R.layout.sosmed,arrayList){

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater:LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.sosmed, null)
        val imageView : ImageView = view.findViewById(R.id.potomarkes)
        val username : TextView = view.findViewById(R.id.namarider)
        val tipe : TextView = view.findViewById(R.id.contact_serviceman)
        imageView.setImageResource(arrayList[position].imgid)
        username.text = arrayList[position].name
        tipe.text = arrayList[position].type
        return view
        }

}