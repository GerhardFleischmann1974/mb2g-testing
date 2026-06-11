package guru.springframework;

import org.junit.Test;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        assert(new JavaHelloWorld().getHello().equals("Hello World"));
    }
}