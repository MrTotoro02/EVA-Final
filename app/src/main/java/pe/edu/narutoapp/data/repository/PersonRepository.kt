package pe.edu.narutoapp.data.repository

import pe.edu.narutoapp.data.Personajes
import pe.edu.narutoapp.data.response.ApiResponse
import pe.edu.narutoapp.data.retrofit.RtHelper

class PersonRepository {

    suspend fun getPerson(): ApiResponse<Personajes>{
        return try {
            val respon = RtHelper.personInstance().getAllPerson()
            ApiResponse.Success(respon)
        }catch (e: Exception){
            ApiResponse.Error(e)
        }
    }
}