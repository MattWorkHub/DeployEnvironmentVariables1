package deployenvironment.controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class DevController {

    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;

    @GetMapping
    public ResponseEntity<String> getHello() {
        String hello = "Hello " + devName + ". Auth Code = " + authCode;
        return ResponseEntity.ok(hello);
    }

}