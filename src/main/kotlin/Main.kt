fun main() {

}

class LeapYear {
    fun isLeapYear(year: Int?): String {
        return if (year == null) {
            "Invalid input"
        } else {
            if (year % 4 == 0) {
                "Is leap year"
            } else {
                "Is not leap year"
            }
        }
    }
}