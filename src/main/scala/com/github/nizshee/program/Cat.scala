package com.github.nizshee.program


import scala.io.Source


class Cat extends Program {
  override def apply(arguments: List[String])(input: Stream[String]): Stream[String] =
    if (arguments.isEmpty) input
    else arguments.foldLeft(Stream.empty[String]) { case (prev, arg) => prev ++ Source.fromFile(arg).getLines.toStream }

}
