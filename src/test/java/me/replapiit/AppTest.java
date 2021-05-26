/* I think we should remove junit because i do not know how to use it and I do not think it will be necessary, but we can keep it for now */
package me.replapiit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(ReplAPI.test());
    }
}
