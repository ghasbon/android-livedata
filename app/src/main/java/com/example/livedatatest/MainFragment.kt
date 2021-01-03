package com.example.livedatatest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val viewModel = MainViewModel()
        viewModel?.message?.observe(this, Observer { messageValue ->
            view.findViewById<TextView>(R.id.message).text = messageValue
        })
        return view
    }
}