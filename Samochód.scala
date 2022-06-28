import akka.actor.*
object Samochód {
  case object Dalej
}
class Samochód extends Actor with ActorLogging {
  def receive: Receive = ???
}
