object scalainaction {

  val time = Time(9, 30)                          //> time  : Time = 09:30
  time.hours                                      //> res0: Int = 9
  time.minutes                                    //> res1: Int = 30
  time.asMinutes                                  //> res2: Int = 570
  
  val time2 = Time(8, 45)                         //> time2  : Time = 08:45
  time minus time2                                //> res3: Int = 45
  
  time == time2                                   //> res4: Boolean = false
  Time(9, 30) == Time(9, 30)                      //> res5: Boolean = true

  Time(10) - Time()                               //> res6: Int = 600
  Time(1) - Time(minutes = 30)                    //> res7: Int = 30
  
  val times = List(Time(9), Time(16, 30), Time(16), Time(9, 30))
                                                  //> times  : List[Time] = List(09:00, 16:30, 16:00, 09:30)
  times.size                                      //> res8: Int = 4

  times.head                                      //> res9: Time = 09:00
  times.tail                                      //> res10: List[Time] = List(16:30, 16:00, 09:30)
  times take 2                                    //> res11: List[Time] = List(09:00, 16:30)
  times drop 2                                    //> res12: List[Time] = List(16:00, 09:30)

  times contains Time()                           //> res13: Boolean = false
  times contains Time(1)                          //> res14: Boolean = false

  times filter (time => time.hours < 12)          //> res15: List[Time] = List(09:00, 09:30)
  times map (time => time.hours)                  //> res16: List[Int] = List(9, 16, 16, 9)
  times map (time => time.copy(hours = time.hours + 1))
                                                  //> res17: List[Time] = List(10:00, 17:30, 17:00, 10:30)
  times groupBy (time => time.hours)              //> res18: scala.collection.immutable.Map[Int,List[Time]] = Map(16 -> List(16:30
                                                  //| , 16:00), 9 -> List(09:00, 09:30))
  times withFilter (time => time.hours > 12) map (time => time.hours - 12 + "pm")
                                                  //> res19: List[String] = List(4pm, 4pm)
  for (time <- times if time.hours > 12) yield time.hours - 12 + "pm"
                                                  //> res20: List[String] = List(4pm, 4pm)
}