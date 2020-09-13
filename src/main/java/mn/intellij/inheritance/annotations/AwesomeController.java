package mn.intellij.inheritance.annotations;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rest/awesome")
public class AwesomeController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}