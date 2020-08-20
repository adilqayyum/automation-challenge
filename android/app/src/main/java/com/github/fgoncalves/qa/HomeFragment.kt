package com.github.fgoncalves.qa

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.github.fgoncalves.qa.databinding.HomeScreenBinding
import kotlinx.android.synthetic.main.home_screen.*

class HomeFragment : Fragment() {

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? =
//        inflater.inflate(R.layout.home_screen, container, false)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: HomeScreenBinding = DataBindingUtil.inflate(
            inflater, R.layout.home_screen, container, false
        )
        binding.OutOfHomeBtn.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_second_act)
        }
        return binding.root
    }
}

//    override fun onResume() {
//        super.onResume()
//
//        this.OutOfHomeBtn.setOnClickListener {
//            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_second_act)
////            view?.apply {
////                postDelayed({
////                    findNavController().navigate(R.id.action_homeFragment_to_second_act)
////                }, 5000)
////            }
//        }
//    }
//}

