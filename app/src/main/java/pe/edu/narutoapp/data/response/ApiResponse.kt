package pe.edu.narutoapp.data.response

import java.lang.Exception

sealed class ApiResponse <T>(data: PersonListReponsive? = null, exception: Exception? = null) {
    data class  Success<T>(val data: PersonListReponsive): ApiResponse<T>(data)
    data class Error<T>(val exception: Exception): ApiResponse<T>(null,exception)
}