object Main extends App {
  def lastN(n: Int, s: Seq[Any]): Seq[Any] = {
    s.length match {
      case l if l <= n => s
      case _ => lastN(n, s.tail)
    }
  }

  println(lastN(2, Seq("a", "b", "c")))
  // output:  List(b, c)


  def lastFoldy(n: Int, s: Seq[Any]) = s.foldLeft(Seq.empty[Any]) { (res, x) =>
    if (res.length < n) res :+ x
    else res.tail :+ x
  }

  println(lastFoldy(2, Seq("a", "b", "c")))
  // output: List(b, c)
}