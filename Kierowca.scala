import akka.actor.*

object Kierowca {
  case object Cyk
  case object PrzygotujAuto
  case class ReakcjaAuta(ov: Option[Int])
  case object PodajTrasÄ™
  case class WynikNaprawy(efekt: Option[ActorRef])
}
class Kierowca extends Actor with ActorLogging {
  def receive: Receive = ???
}
