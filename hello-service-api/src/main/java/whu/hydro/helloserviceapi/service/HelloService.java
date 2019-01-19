package whu.hydro.helloserviceapi.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import whu.hydro.helloserviceapi.dto.User;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author 86187
 * @Date 2019/1/19 13:18
 * @Version 1.0
 */
@RequestMapping("/refactor")
public interface HelloService {
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestParam("name") String name, @RequestParam("name") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
