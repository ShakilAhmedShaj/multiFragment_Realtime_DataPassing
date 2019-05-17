package com.shajt3ch.twofragmentdatapass

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_output.*

class FragmentTwo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_output, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity?.let { output ->
            val sharedViewModel = ViewModelProviders.of(output).get(ViewModel::class.java)

            observeInput(sharedViewModel)
        }
    }

    private fun observeInput(sharedViewModel: ViewModel) {
        sharedViewModel.inputNumber.observe(this, Observer {
            it?.let {
                tv_output.text = "$it"
            }
        })
    }

}