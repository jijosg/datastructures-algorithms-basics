
import com.learn.arrays.Utils
import org.junit.Test
import org.junit.Assert._

class Test1 {
  @Test def t1(): Unit = {
    assertEquals("I was compiled by dotty :)", Utils.msg)
  }
}