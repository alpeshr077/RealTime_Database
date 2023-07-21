package com.example.realtime_database

class DataModel {

    lateinit var key:String
    lateinit var name : String
    lateinit var address : String
    lateinit var number : String

    constructor()

    constructor(key: String, name: String, address: String, number: String) {
        this.key = key
        this.name = name
        this.address = address
        this.number = number
    }


}