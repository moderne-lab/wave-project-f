package com.edwardnoaland.wave.f;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaveProjectFTest {
    @Test
    public void shouldDescribeTheCalculatedValue() {
        assertEquals("project-f:7", WaveProjectF.describe(3));
    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(1, WaveProjectF.calculate(0));
    }
}
