package com.android.navigation_sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.navigation_sample.adapter.FragmentViewPagerAdapter
import com.android.navigation_sample.databinding.FragmentViewPagerBinding

class ViewPagerFragment : Fragment() {

    lateinit var b: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        b = FragmentViewPagerBinding.inflate(layoutInflater)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.viewPagerFragment.adapter = FragmentViewPagerAdapter(requireActivity().supportFragmentManager, lifecycle)
    }
}