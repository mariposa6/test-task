package at.gatling.simulations

import at.gatling.scenarios.Tele2Scenario
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class Tele2Simulation extends Simulation {

  val baseUrl = "https://msk.tele2.ru/"
  val users = 2
  val minutesCount = 3

  val httpProtocol = http
    .baseURL(baseUrl)
    .acceptHeader("application/json, text/plain, */*")
    .acceptEncodingHeader("gzip, deflate, br")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val scenario = Tele2Scenario.tele2Scenario

  setUp(scenario.inject(constantUsersPerSec(users) during (minutesCount minutes))).protocols(httpProtocol)
}