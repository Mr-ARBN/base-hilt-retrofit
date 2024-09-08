package com.example.basehiltretrofit.data.di.module

import com.example.basehiltretrofit.data.source.remote.service.TestApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
internal object TestApiModule {
    @Provides
    fun provideTestApi(
        retrofit: Retrofit
    ): TestApi = retrofit.create(TestApi::class.java)
}