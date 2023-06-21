package com.plcoding.daggerhiltcourse.di

import com.plcoding.daggerhiltcourse.data.repository.MyRepositoryImpl
import com.plcoding.daggerhiltcourse.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds // essa notação permite que o hilt vincule sempre MyRepository seja injetado, MyRepositoryImpl seja implementado
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository
}