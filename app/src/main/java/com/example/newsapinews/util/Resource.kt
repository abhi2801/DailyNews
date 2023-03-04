package com.example.newsapinews.util

sealed class Resource<T>(val data:T?=null,val msg:String?=null){
    class Success<T>(data: T):Resource<T>(data)
    class Failure<T>(msg: String,data: T?):Resource<T>(data, msg)
    class Loading<T>:Resource<T>()
}
