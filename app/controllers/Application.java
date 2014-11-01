package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Hello world"));
    }
	
	public static Result times()
	{
		return TODO;
	}
	
	public static Result newTime()
	{
		return TODO;
	}
	
	public static Result deleteTimes()
	{
		return TODO;
	}
	
	public static Result index()
	{
		return redirect(route.Application.times());
	}
}
