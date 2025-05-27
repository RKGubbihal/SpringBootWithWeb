package test1.SpringBootWithWeb;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller
{
    @GetMapping("/hello")
    public String getData()
    {
        return "<h1> /hello: 'getData' Method: 'SpringBootWithWeb': IntelliJ IDE: Good.....";
    }

    @GetMapping("/gethello")
    public String getHello()
    {
        System.out.println("Displaying SpringBootWithWeb  Message from the 'GetMapping' Method ");
        return "<h1> /gethello: 'getHello' Method: 'SpringBootWithWeb': IntelliJ IDE: Good..... </h1>";
    }

    @PostMapping("/posthello")
    public String postHello()
    {
        System.out.println("Posting 'SpringBootWithWeb' Spring Boot_IntelliJ IDE: Good Application..... from the 'PostMapping' Method ");
        return "<h1> /posthello: 'postHello' 'SpringBootWithWeb': IntelliJ IDE: Good.....</h1>";
    }

    @PutMapping("/puthello")
    public String putHello()
    {
        System.out.println("Putting SpringBootWithWeb  Message from the 'PutMapping' Method ");
        return "<h1> /puthello: 'putHello' 'SpringBootWithWeb': IntelliJ IDE: Good.....</h1>";
    }

    @DeleteMapping("/deletehello")
    public String deleteHello()
    {
        System.out.println("Deleting 'SpringBootWithWeb' Spring Boot_IntelliJ IDE: Good Application..... from the 'DeleteMapping' Method ");
        return "<h1> /deletehello: 'deleteHello' Method:'SpringBootWithWeb': IntelliJ IDE: Good.....</h1>";
    }

}

