package mvc.Controller;

public class ActionFactory {
    private static ActionFactory instance = new ActionFactory();
    public static ActionFactory getInstance(){
        return instance;
    }
    public Action getAction(String command){
        Action action =null;
        if(command.equals("login")){
            action = new UserInfoLoginAction();
        } else if (command.equals("list")) {
            action = new UserInfoListAction();
        } else if (command.equals("update")) {
            action = new UserInfoUpdateAction();
        } else if (command.equals("delete")) {
            action = new UserInfoDeleteAction();
        }else if (command.equals("insert")) {
            action = new UserInfoInsertAction();
        } else if (command.equals("logout")) {
            action = new UserInfoLogoutAction();
        }
        return action;
    }
}
