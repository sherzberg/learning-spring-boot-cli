@Controller
class ThisWillActuallyRun {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!"
    }
    
    @RequestMapping("/api")
    @ResponseBody
    String api() {
        return "Boy Meets World!"
    }

}
