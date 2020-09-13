package mn.intellij.inheritance.annotations;

import javax.inject.Inject;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

public abstract class TestBase {

    @Inject
    @Client("/")
    RxHttpClient client;

}
