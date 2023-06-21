package com.plcoding.daggerhiltcourse.presentation

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.plcoding.daggerhiltcourse.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    // como não é possivel fornecer um cosntrutor a um serviço o hilt permite que seja criada uma
    // variavel que podera que permitira o acesso ao repositorio dentro do serviço
    // isso é chamado de field injection
    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}