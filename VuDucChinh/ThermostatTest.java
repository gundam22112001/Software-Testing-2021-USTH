import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;
public class ThermostatTest
{
    @Before
    public void init(){
        Thermostat ts = new Thermostat();
        ProgrammedSettings s = ProgrammedSettings();
    }
    @Test
    public void True(){
        s.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
        ts.setPeriod(Period.MORNING);
        ts.setDay(DayType.WEEKDAY);
        //clause a
        ts.setCurrentTemp(63);
        ts.setThresholdDiff(5);
        //clause b
        ts.setOverride(true);
        //clause c
        ts.setOverTemp(70);
        //clause d
        ts.setMinLag(10);
        ts.setTimeSinceLastRun(12);
        assertTrue(ts.turnHeaterOn(s));
    }
    @Test
    public void False() {
        s.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
        ts.setPeriod(Period.MORNING);
        ts.setDay(DayType.WEEKDAY);
        //clause a: false
        ts.setCurrentTemp(63);
        ts.setThresholdDiff(15);
        //clause b: false
        ts.setOverride(false);
        //clause c: false
        ts.setOverTemp(60);
        //clause d: false
        ts.setMinLag(15);
        ts.setTimeSinceLastRun(12);
        assertFalse(ts.turnHeaterOn(s));

    }
    @Test
    public void CACCTest(){
        Thermostat t = new Thermostat();
        ProgrammedSettings s = new ProgrammedSettings();
        s.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
        t.setPeriod(Period.MORNING);
        t.setDay(DayType.WEEKDAY);

        t.setCurrentTemp(63);
        t.setThresholdDiff(5);

        t.setCurrentTemp(66);
        t.setThresholdDiff(5);

        t.setOverride(true);
        t.setOverride(false);

        t.setOverTemp(72);
        t.setOverTemp(67);

        t.setMinLag(10);
        t.setTimeSinceLastRun(12);

        t.setMinLag(10);
        t.setTimeSinceLastRun(8);

        assertTrue(t.turnHeaterOn(s));
    }

}