package controllers;

import play.libs.Json;
import play.mvc.*;
import services.display_homepage;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(){
        return ok(Json.toJson("OK home page is loaded"));
    }
    public Result showAllStudents() {
        return ok(Json.toJson(display_homepage.getAllStudents()));
    }
    public Result showAllTeachers() {
        return ok(Json.toJson(display_homepage.getAllTeachers()));
    }
}

