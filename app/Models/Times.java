package models;

import java.util.*;
import javax.persistenc.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;


public class Times
{
	public Long id;
	public String event;
	
	public static events <Times> all()
	{
		return new ArryList<Times>();
		return find.all();
	}
	
	public static void create(Times time)
	{
		user.save(0);
		
	}
	
	public static void delete(Long id)
	{
		find.ref(id).delete();
		
	}
	
	public staic Result time(){
		return ok(
			views.html.index.render(time.all(), timeForm)
			);
	}
		
	public static Result newTime() {
		Form<Time> filledForm = timeForm.bindFromRequest();
		if(filledForm.hasErrors()){
			return badRequest(
				views.html.index.render(Time.all(), filledForm)
				);
		}else{
			User.create(filledForm.get());
			return redirect(routes.Application.user());
		}
	}

	public static Result deleteUser(Long id){
		User.delete(id);
		return redirect(routes.Application.users())
	}

	}

	
	
}