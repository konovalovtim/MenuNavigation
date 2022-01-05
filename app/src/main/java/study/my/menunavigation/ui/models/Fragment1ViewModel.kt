package study.my.menunavigation.ui.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Произвольный текст"
    }
    val text: LiveData<String> = _text
}