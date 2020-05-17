package com.example.diploma1

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Endpoints {
    @GET("/api/studentData")
    fun getStudentData(@Query("student_id") key: Int): Call<StudentData>
}