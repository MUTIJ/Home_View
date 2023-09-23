# MovieApp-MVVM-Interview

A simple project using The Movie DB based on Kotlin MVVM architecture

# API

* https://www.themoviedb.org/documentation/api


# Libraries and tools

* [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - notify domain layer data to views.
* [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - dispose observing data when lifecycle state changes.
* [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - UI related data holder, lifecycle aware.
* [Retrofit2 & Gson](https://github.com/square/retrofit) - constructing the REST API
* [OkHttp](https://github.com/square/okhttp) - implementing interceptor, logging and mocking web server
* [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview) - implementing adapters and viewHolders
* [RxJava2](https://developer.android.com/reference/kotlin/androidx/ui/rxjava2/package-summary) - For a seamless user experience
* [Glide](https://github.com/bumptech/glide) - loading images
* [DataBinding](https://developer.android.com/topic/libraries/data-binding)
 
# Architecture

* [MVVM Architecture](https://developer.android.com/jetpack/guide) (Model -View - ViewModel)

# Flow

* The app uses retrofit to fetch data from the tmdb api which is then cached to be accessible online. (Any Data must be fetched initially). The data is paginated to enhance speed. (20 items per page). When the user scrolls, the next page is fetched with the same number of movies if there's am imternet connection. If no internet connection, the user is notified appropriately.

# Edge cases captured

* If data is already cached, don't make api requests
* If there's no internet connection, fetch cached data, if there's no cached data, show "no internet"








