package com.scudderapps.moviesup.adapter.movie

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.scudderapps.moviesup.fragments.moviedetails.MovieAboutFragment
import com.scudderapps.moviesup.fragments.moviedetails.MovieCastFragment
import com.scudderapps.moviesup.fragments.moviedetails.MovieMediaFragment

class MovieDetailTabAdapter(
    private val movieId: Int,
    private val myContext: Context,
    fm: FragmentManager,
    private var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return MovieAboutFragment(movieId)
            }
            1 -> {
                return MovieMediaFragment(movieId)
            }
            2 -> {
                return MovieCastFragment(movieId)
            }
        }
        return MovieAboutFragment(movieId)
    }

    override fun getCount(): Int {
        return totalTabs
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "About"
            1 -> "Trailers & Media"
            2 -> "Cast"
            3 -> "Reviews"
            4 -> "Similar"
            5 -> "Recommended"
            else -> null
        }
    }
}