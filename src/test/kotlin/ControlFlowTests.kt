import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ControlFlowTests {

    private val testLeapYear: LeapYear = LeapYear()

    @Test
    fun testIsLeapYear_flow1() {
        val inputYear = null;
        val expectedValue = "Invalid input";
        assertEquals(expectedValue, testLeapYear.isLeapYear(inputYear))
    }

    @Test
    fun testIsLeapYear_flow2() {
        val inputYear = 1000;
        val expectedValue = "Is not leap year";
        assertEquals(expectedValue, testLeapYear.isLeapYear(inputYear))
    }

    @Test
    fun testIsLeapYear_flow3() {
        val inputYear = 1001;
        val expectedValue = "Is not leap year";
        assertEquals(expectedValue, testLeapYear.isLeapYear(inputYear))
    }
}