package com.mydigipay.challenge.mvvm.repositorysearchfragment

import com.mydigipay.challenge.infrastructure.data.DataManager
import com.mydigipay.challenge.infrastructure.utils.SchedulersProvider
import com.mydigipay.challenge.mvvm.repositorysearchfragment.adapter.RepositoryAdapter
import dagger.Module
import dagger.Provides

/**
 * Created by Mahdi Zare Tahghigh Doost on 6/4/2020.
 *
 * mahdiZTD@gmail.com
 */

@Module
class RepositorySearchModule {

    @Provides
    fun provideViewModel(
        dataManager: DataManager,
        schedulersProvider: SchedulersProvider
    ): RepositorySearchViewModel =
        RepositorySearchViewModel(dataManager, schedulersProvider)

    @Provides
    fun provideAdapter(): RepositoryAdapter = RepositoryAdapter(mutableListOf())
}