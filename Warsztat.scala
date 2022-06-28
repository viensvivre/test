import akka.actor.*
object Warsztat {
  case object Cyk
  case class Awaria(auto: ActorRef)
}
class Warsztat extends Actor with ActorLogging {
  def receive: Receive = ???
}
