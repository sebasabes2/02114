import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class BeqTest extends AnyFlatSpec with ChiselScalatestTester {
  "CPU " should "pass" in {
    test(new CPU()) { dut =>
      val array = Array(
        0x00000e63, //beq x0 x0 28
        0x00000013, //addi x0 x0 0
        0x00000013, //addi x0 x0 0
        0x00000013, //addi x0 x0 0
        0x00100093, //addi x1 x0 1
        0x00100113, //addi x2 x0 1
        0x00100193, //addi x3 x0 1
        0x00100213, //addi x4 x0 1
        0x00100293, //addi x5 x0 1
        0x00100313, //addi x6 x0 1
      )
      RunProgram(dut,array)
      for (i <- 1 to 3){
        dut.io.reg(i).expect(0)
      }
      for (i <-4 to 6){
        dut.io.reg(i).expect(1)
      }
    }
  }
}
