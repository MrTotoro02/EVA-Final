package pe.edu.narutoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pe.edu.narutoapp.R
import pe.edu.narutoapp.data.Personajes
import pe.edu.narutoapp.data.getData
import pe.edu.narutoapp.data.repository.PersonRepository
import pe.edu.narutoapp.data.response.ApiResponse


class ListarApiViewModel : ViewModel() {

    val person : MutableLiveData<List<Personajes>> = MutableLiveData<List<Personajes>>()
    val repository = PersonRepository()

    fun getPersonas() {

        val allPerson = getData()
        person.value = allPerson
    }

    fun getPersonFromService(){

        viewModelScope.launch(Dispatchers.IO) {

            val response = repository.getPerson()
            when(response){
                is ApiResponse.Error ->{

                }
                is ApiResponse.Success ->{
                    person.postValue(response.data.characters)
                }
            }
        }
    }


}