package com.example.practice1

import java.io.Serializable

data class Animal(
    var name: String? = null,
    var songName: String? = null,
    var time: String? = null,
    var imageMusic: String? = null
) : Serializable
