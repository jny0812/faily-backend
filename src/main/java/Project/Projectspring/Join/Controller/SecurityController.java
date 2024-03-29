//package Project.Projectspring.Join.Controller;
//
//
//import Project.Projectspring.Join.Service.SecurityService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletResponse;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//@RestController
//@RequiredArgsConstructor
//public class SecurityController {
//
//    private final SecurityService securityService;
//    private final HttpServletResponse response;
//
//
//
//
//    @GetMapping("/get/token")
//    @ResponseBody
//    public Map<String, Object> getToken(String subject) {
//        String token = securityService.createToken(subject, (2 * 1000 * 60));
//        Map<String, Object> map = new LinkedHashMap<String, Object>();
//        map.put("result", token);
//        return map;
//    }
//
//    @ResponseBody
//    @GetMapping("/get/subject")
//    public Map<String, Object> getSubject(@RequestParam("token") String token) {
//        String subject = securityService.getSubject(token);
//        Map<String, Object> map = new LinkedHashMap<String, Object>();
//        map.put("result", subject);
//        return map;
//    }
//
//
//}
//
