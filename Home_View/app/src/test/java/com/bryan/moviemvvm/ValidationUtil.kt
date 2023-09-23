package com.bryan.moviemvvm

import com.bryan.moviemvvm.data.vo.Movie

object ValidationUtil {


    fun validateMovie(movie: Movie): Boolean {
        if (movie.title.isNotEmpty() && movie.releaseDate.isNotEmpty()) {
            return true
        }
        return false
    }

}