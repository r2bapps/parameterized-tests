package com.example.parameterizedTests.parameters

import com.example.parameterizedTests.oos.Person
import com.example.parameterizedTests.oos.Shared
import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class ByPrefix {

  @Test
  @Parameters
  fun isAdultAgeDefaultMethod(age: Int, valid: Boolean) {
    assertEquals(valid, Person(age).isAdult)
  }

  @SuppressWarnings("unused")
  private fun parametersForIsAdultAgeDefaultMethod(): Array<Any> {
    return Shared.adultValues()
  }

}