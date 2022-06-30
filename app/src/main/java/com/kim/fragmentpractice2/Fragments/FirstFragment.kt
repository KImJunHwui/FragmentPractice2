package com.kim.fragmentpractice2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kim.fragmentpractice2.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       changeSubjectBtn.setOnClickListener {

           firstFragmentTxt.text = "김준휘 입니다."
       }

        makeToastBtn.setOnClickListener {
            Toast.makeText(context, "지율이 입니다", Toast.LENGTH_SHORT).show()
        }
    }

}

