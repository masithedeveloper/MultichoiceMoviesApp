package com.update.multichoicemoviesapp.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoviesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is top 5 movies Fragment"
    }
    val text: LiveData<String> = _text
}