package at.gatling.actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Tele2Actions {

  //Переход на главную страницу
  val toMainPage = http("toMainPage")
    .get("/")

  //Переход в меню тарифы
  val toRatePage = http("toRatePage")
    .get("/tariffs?format=json")

  //Проваливаемся в тариф "Везде онлайн"
  val toAnyRatePage = http("toAnyRatePage")
    .get("/tariff/everywhere-online?format=json")

  //Переход в меню роуминг
  val toRoamingPage = http("toRoamingPage")
    .get("/mobile/roaming?format=json")

}
