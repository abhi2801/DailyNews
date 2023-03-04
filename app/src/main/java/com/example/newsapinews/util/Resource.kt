package com.example.newsapinews.util

sealed class Resource<T>(val data:T?=null,msg:String?=null){
    class Loading<T>:Resource<T>()
    class Success<T>(data: T):Resource<T>(data)
    class Failure<T>(msg:String,data: T?):Resource<T>(data, msg)
}
