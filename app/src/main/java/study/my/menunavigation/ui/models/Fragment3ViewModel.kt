package study.my.menunavigation.ui.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Остров Котлин"
    }
    val text: LiveData<String> = _text
}