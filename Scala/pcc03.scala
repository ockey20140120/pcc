import scala.collection.mutable.ListBuffer

object pcc03 {
	def main(args: Array[String]) {
		var n = 10
		var x = List(2, 6, 8)
		var max = ListBuffer("Right", "Right", "Right")
		var min = ListBuffer("Right", "Right", "Right")
		if (n < 1 || n > 50) System.out.println("n: Domain error. Must be (1 <= n <= 50).")
		for(obj <- x) {
			if (obj < 1 || obj > n) System.out.println("x: Domain error. Must be (1 <= x <= " + n + ").")
		}
		for (i <- 0 until x.size) {
			if (x(i) < (n - x(i))) {
				min.update(i, "Left")
			} else {
				max.update(i, "Left")
			}
		}
		PrintArray("Max : ", max)
		PrintArray("Min : ", min)
	}
	def PrintArray (str: String, list: ListBuffer[String]) {
		System.out.print(str)
		for(obj <- list) {
			System.out.print(obj + ",")
		}
		System.out.println()
	}
}
