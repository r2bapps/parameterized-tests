package com.example.parameterizedTests.parameters

import com.example.parameterizedTests.oos.Person
import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class BySource {

  @Test
  @Parameters(source = PersonProvider::class)
  fun personIsAdult(person: Person, valid: Boolean) {
    assertEquals(valid, person.isAdult)
  }

  object PersonProvider {
    @JvmStatic
    fun provideAdults(): Array<Any> {
      return arrayOf(arrayOf(Person(18), true), arrayOf(Person(25), true), arrayOf(Person(32), true))
    }
    @JvmStatic
    fun provideTeens(): Array<Any> {
      return arrayOf(arrayOf(Person(12), false), arrayOf(Person(17), false))
    }
  }

}