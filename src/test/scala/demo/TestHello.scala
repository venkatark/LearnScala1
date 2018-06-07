package demo
import org.scalatest.FunSuite


class TestHello extends FunSuite {
  override def withFixture(test: NoArgTest) = { // Define a shared fixture
    // Shared setup (run at beginning of each test)
    try test()
    finally {
      // Shared cleanup (run at end of each test)
    }
  }
  test("tests hellow method works correctly") {
      val thello = new Hello
      assert(thello.sayhello("test") == "test")
  }

}
