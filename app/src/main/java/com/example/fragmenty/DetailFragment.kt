package com.example.fragmenty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_detail, container, false)

        val item = arguments?.getString(ARG_ITEM)
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = item

        return view
    }

    companion object {

        private const val ARG_ITEM = "item"

        fun newInstance(item: String): DetailFragment{
            val fragment = DetailFragment()
            val args = Bundle()
            args.putString(ARG_ITEM, item)
            fragment.arguments = args
            return fragment

        }
    }
}