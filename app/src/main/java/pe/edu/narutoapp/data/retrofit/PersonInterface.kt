package pe.edu.narutoapp.data.retrofit

import pe.edu.narutoapp.data.response.PersonListReponsive
import retrofit2.http.GET

interface PersonInterface {
    @GET("/api/character")
    suspend fun getAllPerson(): PersonListReponsive

}