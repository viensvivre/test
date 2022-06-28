import akka.actor.*

object Organizator {
  case class UstawMaksCyk(maksCyk: Int) {
    assert(maksCyk > 0)
  }
  case object Cyk
  case class PrzejechanaTrasa(liczbaKm: Int)
}
class Organizator extends Actor with ActorLogging {
  import Organizator.*
  def receive = {
    case UstawMaksCyk(mc) =>
      log.info(s"liczba cyknięć do wykonania: $mc")
      context.become(poInicjalizacji(mc))
    case _ => // inne pomijamy
  }

  def poInicjalizacji(maksCyk: Int): Receive = {
    case Cyk =>
      log.info("Cyk")
      // …
  }
}

