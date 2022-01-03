package com.halal.halal_appmwllc.mainfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.halal.halal_appmwllc.R
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lichnuyKabinet.setOnClickListener{nextKabinet(view)}
        btn_settings.setOnClickListener{nextSettings(view)}
    }
    fun nextKabinet(view: View){
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_lishnye_Kabinet_Fragment)
    }
    fun nextSettings(view: View){
        val navController = Navigation.findNavController(view)
        navController.navigate(R.id.action_menuFragment_to_settingsFragment2)
    }
}