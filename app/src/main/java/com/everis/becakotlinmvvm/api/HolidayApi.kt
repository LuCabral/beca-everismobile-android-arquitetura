package com.everis.becakotlinmvvm

import com.everis.becakotlinmvvm.model.HolidayModel
import retrofit2.Call
import retrofit2.http.GET

interface HolidayApi {

    @GET("PublicHolidays/2021/br")
    fun getHolidays(): Call<List<HolidayModel>>
}