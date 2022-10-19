package com.example.parameterizedTests.parameters

import com.example.parameterizedTests.oos.Person
import com.example.parameterizedTests.oos.Shared
import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class ByMethod {

  @Test
  @Parameters(method = "adultValues")
  fun isAdultAgeDefinedMethod(age: Int, valid: Boolean) {
    Assert.assertEquals(valid, Person(age).isAdult)
  }

  @SuppressWarnings("unused")
  fun adultValues(): Array<Any> {
    return Shared.adultValues()
  }

}