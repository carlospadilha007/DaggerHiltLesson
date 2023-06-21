package com.plcoding.daggerhiltcourse.presentation
import androidx.lifecycle.ViewModel
import com.plcoding.daggerhiltcourse.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(

    // Normalmente a dependencia é injetada no momento em que as classes são construidas,
    // ou seja em tempo de compilação. O uso de Lazy Injection permite que a injeção só seja feita
    // quando o repositorio é chamado em tempo de execução, ou seja permite que por exemplo o
    // repositorio seja criado depois da coleta de algum dado do usuário ou da alguma api
    private val repository: Lazy<MyRepository>
): ViewModel() {

    init {
        repository.get()
    }
}