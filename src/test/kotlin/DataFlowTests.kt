import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DataFlowTests {
    private val testLeapYear: LeapYear = LeapYear()

    @Test
    fun testIsLeapYear_flow1() {
        val inputYear = null;
        val expectedValue = "Invalid input";
        assertEquals(expectedValue, testLeapYear.isLeapYear(inputYear))
    }

    @Test
    fun testIsLeapYear_flow2() {
        val inputYear = 2000;
        val expectedValue = "Is not leap year";
        assertEquals(expectedValue, testLeapYear.isLeapYear(inputYear))
    }

    @Test
    fun testIsLeapYear_flow3() {
        val inputYear = 2004;
        val expectedValue = "Is leap year";
        assertEquals(expectedValue, testLeapYear.isLeapYear(inputYear))
    }

    @Test
    fun testIsLeapYear_flow4() {
        val inputYear = 2001;
        val expectedValue = "Is not leap year";
        assertEquals(expectedValue, testLeapYear.isLeapYear(inputYear))
    }
}