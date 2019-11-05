package my.edu.tarc.demo23navigation.ui.send

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is send Fragment"
    }

    val text: LiveData<String> = _text
    var message:String = ""
    var receiver:String = ""


    fun getEmailReceiver(): String{
        return receiver
    }

    fun getEmailMessage(): String{
        return message
    }
}