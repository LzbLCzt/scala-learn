package `implicit`

import org.scalatest.FlatSpec

class ImplicitExample extends FlatSpec{
  "implicit" should "work" in {
    //todo 类型增强 - 给Int添加一个隐式转换，使其能够调用square方法
    implicit def intToRichInt(i: Int) = new RichInt(i)
    assertResult(9)(3.square)
  }

  class RichInt(val i: Int) {
    def square(): Int = i * i
  }
}

