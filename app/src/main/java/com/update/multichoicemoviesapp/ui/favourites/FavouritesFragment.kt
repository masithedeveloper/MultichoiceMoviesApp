package com.update.multichoicemoviesapp.ui.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.update.multichoicemoviesapp.R
import com.update.multichoicemoviesapp.databinding.FragmentFavouritesBinding
import com.update.multichoicemoviesapp.ui.movies.MoviesViewModel


class FavouritesFragment : Fragment() {

    private var _binding: FragmentFavouritesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val moviesViewModel =
            ViewModelProvider(this).get(MoviesViewModel::class.java)

        _binding = FragmentFavouritesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        moviesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val toolbar: Toolbar = root!!.findViewById(R.id.toolbar)
        //toolbar.setNavigationIcon(R.id.button)
        toolbar.setNavigationOnClickListener(View.OnClickListener { requireActivity().onBackPressed() })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}