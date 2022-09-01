package com.android.navigation_sample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.android.navigation_sample.FragmentOne
import com.android.navigation_sample.FragmentThree
import com.android.navigation_sample.FragmentTwo

class FragmentViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
        }
        return FragmentOne()
    }

}