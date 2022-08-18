package com.jstarczewski.kmmadapter

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}