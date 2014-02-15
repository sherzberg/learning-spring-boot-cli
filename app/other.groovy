@Controller
class OtherController {

    @RequestMapping("/two")
    @ResponseBody
    String home() {
        return "Hello World!"
    }
    
    @RequestMapping("/three")
    @ResponseBody
    String api() {
        return "Boy Meets World!"
    }

}
