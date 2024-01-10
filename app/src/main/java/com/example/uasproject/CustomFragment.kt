package com.example.uasproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import android.widget.Toast

class CustomFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_custom, container, false)

        val names = arrayOf(
            "JDM_Car",
            "JDM_Car",
            "JDM_Car",
            "JDM_Car"
        )

        val profileImages = arrayOf(
            R.drawable.jdm,
            R.drawable.jdm,
            R.drawable.jdm,
            R.drawable.jdm
        )

        val postImages = arrayOf(
            R.drawable.gtrr34b,
            R.drawable.gtrnismo,
            R.drawable.s13,
            R.drawable.supraw
        )

        val listView = view.findViewById<ListView>(R.id.listview_car)
        val customAdapter = AdapterKu(requireActivity(), names, profileImages, postImages)
        listView.adapter = customAdapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = names[position]
            Toast.makeText(requireContext(), "Item yang diklik adalah: $selectedItem", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
