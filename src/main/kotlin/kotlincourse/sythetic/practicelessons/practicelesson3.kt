package com.synthetic.kotlincourse.com.synthetiс.kotlincourse

val name: String = "Alice"

var age: Int = 30

const val PI = 3.14

lateinit var userInfo: String

val lazyValue: String by lazy {
    "Hello, this is a lazy string!"
}

var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    }

val chassis: String = "a23"

var color: String = "Red"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by lazy {
    ""
}

var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value >= 0) field += value
    }




