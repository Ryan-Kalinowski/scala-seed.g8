package main

import org.scalatest._

final class MainSpec extends FlatSpec with Matchers {
  "An empty list" should "be Nil" in {
    List() should equal (Nil)
  }
}
