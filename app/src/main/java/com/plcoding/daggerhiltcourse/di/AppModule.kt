package com.plcoding.daggerhiltcourse.di

import com.plcoding.daggerhiltcourse.data.remote.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // Há outro parâmetros que acompanham o tempo de vida
// componentes especificos, como viewmodel e activits. SingletonComponent acompanha durante toda a vida

object AppModule {

    @Provides
    @Singleton // implica na criação de apenas uma instância do provide api
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    @Named("hello1") // Named define um nome que podemos usar para que o hilt
    // saiba qual função chamar, casos as duas tiverem o provedores com o mesmo tipo de retorno
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}