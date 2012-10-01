object scalainaction {

  val time = new Time(9, 30)                      //> time  : Time = Time@77151cae
  time.hours                                      //> res0: Int = 9
  time.minutes                                    //> res1: Int = 30
  time.asMinutes                                  //> res2: Int = 570
  
  val time2 = new Time(8, 45)                     //> time2  : Time = Time@7a112202
  time minus time2                                //> res3: Int = 45
}