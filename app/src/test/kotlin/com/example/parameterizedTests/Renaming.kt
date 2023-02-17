package com.example.parameterizedTests

import com.example.parameterizedTests.oos.Person
import junitparams.JUnitParamsRunner
import junitparams.Parameters
import junitparams.naming.TestCaseName
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class Renaming {

  @Test
  @Parameters("17, false", "18, true", "22, true")
  @TestCaseName("Is person with age {0} adult? It's {1} statement.")
  fun isAdultWithCustomTestName(age: Int, valid: Boolean) {
    assertEquals(valid, Person(age).isAdult)
  }

}