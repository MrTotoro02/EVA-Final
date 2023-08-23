package pe.edu.narutoapp.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RtHelper {

    private val retrofitinstance = Retrofit.Builder()
        .baseUrl("https://www.narutodb.xyz")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun  personInstance (): PersonInterface = retrofitinstance.create(PersonInterface::class.java)
}