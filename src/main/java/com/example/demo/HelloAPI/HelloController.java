
package com.example.demo.HelloAPI;

import com.example.demo.HelloAPI.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestBody String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
    @DeleteMapping("/delete/{firstName}")
    public String delete(@PathVariable String firstName) {
        return "sucessfully deleted " + firstName + " from BridgeLabz";
    }
    

}
