package com.example.parameterizedTests.parameters

import com.example.parameterizedTests.oos.Person
import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class Inlined {

  @Test
  @Parameters("17, false", "18, true", "22, true")
  fun isAdultAgeDirectComaSeparated(age: Int, valid: Boolean) {
    assertEquals(valid, Person(age).isAdult)
  }

  @Test
  @Parameters("17 | false", "18 | true", "22 | true")
  fun isAdultAgeDirectPipeSeparated(age: Int, valid: Boolean) {
    assertEquals(valid, Person(age).isAdult)
  }

}