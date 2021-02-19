package learnfp.typeclass
import org.scalatest._

class TypeClassTest extends FlatSpec with Matchers {
  import TypeClassInstances._
  "typeclass ints" should "give \"int\"" in {
    TypeClassUser.foo(1) shouldBe "int"
  }

  "typeclass strings" should "give \"string\"" in {
    TypeClassUser.foo("a") shouldBe "string"
  }
}
