package at.gatling.scenarios

import at.gatling.actions.Tele2Actions
import io.gatling.core.Predef.scenario

object Tele2Scenario {

  val tele2Scenario = scenario("Tele2 performance test")
    .exec(Tele2Actions.toMainPage)
    .exec(Tele2Actions.toRatePage)
    .exec(Tele2Actions.toAnyRatePage)
    .exec(Tele2Actions.toRoamingPage)

}
