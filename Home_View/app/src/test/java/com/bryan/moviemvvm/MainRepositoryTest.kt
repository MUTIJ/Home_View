package com.bryan.moviemvvm

import com.bryan.moviemvvm.data.api.TheMovieDBInterface
import com.bryan.moviemvvm.ui.popular_movie.MoviePagedListRepository
import io.reactivex.disposables.CompositeDisposable
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class MainRepositoryTest {

    lateinit var mainRepository: MoviePagedListRepository
    private var compositeDisposable: CompositeDisposable = CompositeDisposable()

    @Mock
    lateinit var apiService: TheMovieDBInterface

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        mainRepository = MoviePagedListRepository(apiService)
    }



}
