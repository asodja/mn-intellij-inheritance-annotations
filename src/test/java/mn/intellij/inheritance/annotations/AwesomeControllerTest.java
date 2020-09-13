package mn.intellij.inheritance.annotations;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.*;
import io.micronaut.test.annotation.MicronautTest;

import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class AwesomeControllerTest extends TestBase {

    @Test
    public void testIndex() {
        assertEquals(HttpStatus.OK, client.toBlocking().exchange("/awesome").status());       
    }
}
