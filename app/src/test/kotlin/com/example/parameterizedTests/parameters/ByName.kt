package com.example.parameterizedTests.parameters

import com.example.parameterizedTests.oos.Person
import com.example.parameterizedTests.oos.Shared
import junitparams.JUnitParamsRunner
import junitparams.NamedParameters
import junitparams.Parameters
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class ByName {

  @Test
  @Parameters(named = "grownups")
  fun isAdultAgeDefinedMethod(age: Int, valid: Boolean) {
    Assert.assertEquals(valid, Person(age).isAdult)
  }

  @SuppressWarnings("unused")
  @NamedParameters("grownups")
  fun foo(): Array<Any> {
    return Shared.adultValues()
  }

  /*
  --DOES NOT WORK--
  @NamedParameters("grownups")
  val foo: Array<Any> = Shared.adultValues()
  */

}