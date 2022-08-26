package com.update.multichoicemoviesapp.ui.orderedmovies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderedMoviesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is ordered movies Fragment"
    }
    val text: LiveData<String> = _text
}