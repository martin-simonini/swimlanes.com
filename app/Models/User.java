package models;

import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;


public class User
{

	public Long id;
	@Required
	public String username;
	@Required
	public String password;
	
	
public static user<User> all(){
	return new ArrayList<User>;
	return find.all();
}

public static void create(User user){
	user.save(0);
	
}

public static void delete(Long id){
	find.ref(id).delete();
}

public static Result user(){
	return ok(
		views.html.index.render(User.all(), userForm)
		);
}

public static Result newUser() {
	Form<User> filledForm = userForm.bindFromRequest();
	if(filledForm.hasErrors()){
		return badRequest(
			views.html.index.render(User.all(), filledForm)
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
