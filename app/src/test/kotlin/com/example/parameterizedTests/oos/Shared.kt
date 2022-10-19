package com.example.parameterizedTests.oos

object Shared {
  fun adultValues(): Array<Any> {
    return arrayOf(
      arrayOf<Any>(17, false),
      arrayOf<Any>(18, true),
      arrayOf<Any>(22, true)
    )
  }
}
