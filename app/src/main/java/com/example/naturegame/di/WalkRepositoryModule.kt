package com.example.naturegame.di

import com.example.naturegame.data.local.dao.WalkSessionDao
import com.example.naturegame.data.repository.WalkRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WalkRepositoryModule {

    @Provides
    @Singleton
    fun provideWalkRepository(
        walkSessionDao: WalkSessionDao
    ): WalkRepository {
        return WalkRepository(walkSessionDao)
    }
}
