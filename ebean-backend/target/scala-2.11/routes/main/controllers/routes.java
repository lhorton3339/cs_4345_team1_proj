
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/laure/Desktop/Lab-2-Ebean/team1_proj/ebean-backend/conf/routes
// @DATE:Mon Apr 25 14:46:19 CDT 2022

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePaperController PaperController = new controllers.ReversePaperController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePaperController PaperController = new controllers.javascript.ReversePaperController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
