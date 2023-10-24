package com.example.myapplication.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.myapplication.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr :String by mutableStateOf("")
        private set

    var noTlp : String by mutableStateOf("")
        private  set

    var jenisKl : String by mutableStateOf("")
        private  set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String, tlp:String, jk:String){
        namaUsr=nm;
        noTlp=tlp;
        jenisKl=jk;
    }

    fun setJenisK(pilihJK:String){
        _uiState.update { currentState -> currentState.copy()}
    }

    fun insertData(textNama: String, textTlp: String, sex: String) {

    }
}