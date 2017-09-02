import common._
import forcomp._

val A = "hola mi amor"

"holaohogla".groupBy(c => c.toLower).map( p => (p._1, p._2.length)).toList
  .sortWith(_._1 < _._1)

val B = List("hola", "mi", "amor", "querido")

B.reduce(_ concat _)

val occurrances: Anagrams.Occurrences = List(('a', 2), ('b', 2))

Anagrams.combinations(occurrances)
