/**
  * Created by vgalcenco on 5/16/17.
  */
object RomanNumbersConverter {

  def toRomanNumber(int: Int): String = {
    if      (int >= 50) "L"   + toRomanNumber(int - 50)
    else if (int >= 40) "XL"  + toRomanNumber(int - 40)
    else if (int >= 10) "X"   + toRomanNumber(int - 10)
    else if (int >= 9)  "IX"  + toRomanNumber(int - 9)
    else if (int >= 5)  "V"   + toRomanNumber(int - 5)
    else if (int >= 4)  "IV"  + toRomanNumber(int - 4)
    else if (int >  0)  "I"   + toRomanNumber(int - 1)
    else ""
  }

}
