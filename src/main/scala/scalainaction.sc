object scalainaction {

  val time = Time(9, 30)                          //> time  : Time = Time(9,30)
  time.hours                                      //> res0: Int = 9
  time.minutes                                    //> res1: Int = 30
  time.asMinutes                                  //> res2: Int = 570
  
  val time2 = Time(8, 45)                         //> time2  : Time = Time(8,45)
  time minus time2                                //> res3: Int = 45
  
  time == time2                                   //> res4: Boolean = false
  Time(9, 30) == Time(9, 30)                      //> res5: Boolean = true
}