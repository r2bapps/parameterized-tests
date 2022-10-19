package com.example.parameterizedTests.oos

class Person {
  var name: String? = null
    private set
  var age: Int
    private set

  constructor(age: Int) {
    this.age = age
  }

  constructor(name: String?, age: Int) {
    this.name = name
    this.age = age
  }

  val isAdult: Boolean
    get() = age >= 18

  override fun toString(): String {
    return "Person of age: $age"
  }
}
